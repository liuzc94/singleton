package com.single.Lazy;

public class LazySafeTwoTest {
    public static void main(String[] args) {
        int count = 100000;
        Long start = System.currentTimeMillis();
        for (int i=0;i<count;i++){
            //加锁，安全  性能比较
            // LazyTwo lazyTwo = LazyTwo.getInstance();
            //没加锁，不安全
             LazyOne lazyOne = LazyOne.getInstance();
        }
        Long end = System.currentTimeMillis() - start;
        System.out.println("共花费时间：" + end);

    }
}
