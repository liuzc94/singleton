package com.single.Lazy;

/**
 * 懒汉式
 * 存在线程安全
 */
public class LazyOne {
    private LazyOne(){}
    //静态块，公共内存区域
    private static LazyOne lazyOne = null;
    public static LazyOne getInstance(){
        if (lazyOne == null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }
}
