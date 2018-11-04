package seriable;

import java.io.Serializable;
//序列化时导致单例破坏
public class Seriable implements Serializable {
    /**
     * 序列化就是说把内存状态通过转化 成字节码的形式
     *  从而转化成io流，写入到其他地方（比如磁盘）
     *
     *  反序列化
     *  把已经持久化的字节码内容，转化为io流
     *  通过io流的读取，进而将读取的内容转化为java对象
     *  在转化的过程中会重新new对象
     */
    private final static  Seriable INSTANCE = new Seriable();
    private  Seriable(){}

    public  static  Seriable getInstance(){
        return INSTANCE;
    }

    private  Object readResolve(){
        return  INSTANCE;
    }

}
