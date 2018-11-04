package com.single;

/**
 * 饿汉式
 * 在类加载时就立即初始化建立单例
 * 优点：没有加任何的锁，在用户体验上来说，他是比懒汉式体验更好
 *       线程绝对安全
 * 缺点：在类加载的时候就实例化了，用或不用都实例了，一定程度上浪费了内存
 */
public class Hungry {
    private Hungry() {
    }
    private static final Hungry hungry = new Hungry();

    public static Hungry getInstance() {
        return hungry;
    }

}
