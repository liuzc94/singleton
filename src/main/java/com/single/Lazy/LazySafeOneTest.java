package com.single.Lazy;

import java.util.concurrent.CountDownLatch;

/**
 * 测试并发情况下 LazyOne 单例是有问题的
 */
public class LazySafeOneTest {

    public static void main(String[] args) {
        int count = 20000;
        //发令枪
        final CountDownLatch latch = new CountDownLatch(count);

        for (int i = 0; i < count; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        // 阻塞 当latch 为0是 释放所有的锁
                        latch.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                   LazyOne obj = LazyOne.getInstance();
                    System.out.println("时间：" + System.currentTimeMillis() + "实例：" + obj);
                }
            }).start();
            //相当于count --;
            latch.countDown();

        }
    }


}
