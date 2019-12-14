package com.liuquanju.designerpattern.singleton.type1;

/**
 * 单例模式（饿汉式）
 * 优点：在类加载的时候就实例化，避免了多线程同步问题
 * 缺点：在类加载的时候就实例化，没有达到懒加载的效果，如果从始至终没有使用该类，则造成内存浪费
 */
public class Singleton {
    //1.提供一个私有的构造器防止new对象的实例
    private Singleton() {}

    //2.提供一个静态变量
    private static final Singleton instance = new Singleton();

    //3.提供一个静态方法获取实例
    public static Singleton getInstance(){
        return instance;
    }
}
