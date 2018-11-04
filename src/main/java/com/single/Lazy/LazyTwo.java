package com.single.Lazy;

/**
 * 加锁 性能不好
 */
public class LazyTwo {
    private LazyTwo(){}
    //静态块，公共内存区域
    private static LazyTwo lazyTwo = null;
    public static synchronized LazyTwo getInstance(){
        if (lazyTwo == null){
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }
}
