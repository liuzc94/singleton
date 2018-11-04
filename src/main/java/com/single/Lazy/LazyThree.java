package com.single.Lazy;

/**
 * 这种懒汉式特点时 只有外部类被调用的时候内部类才会加载
 *
 * 这种形式兼顾饿汉式的内存，也兼顾synchronized 的性能问题
 */
public class LazyThree {
    private static boolean initialized = false;
    //防止被强制访问
    private LazyThree(){
        synchronized (LazyThree.class){
            if (initialized == false){
                initialized = true;
            }else{
                throw new RuntimeException("单例已被破坏");
            }
        }
    }

    //static 是为了单例的空间共享
    //保证这个方法不会被重写 重载
    public static final  LazyThree getInstance(){
        return LazyHolder.LAZY;
    }

    //内部类，默认不加载
    private static class LazyHolder{
        private static final LazyThree LAZY = new LazyThree();
    }
}
