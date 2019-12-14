package com.liuquanju.designerpattern.singleton.type2;

/**
 * 单例模式（饿汉式）
 * 优点：在类加载的时候就实例化，避免了多线程同步问题
 * 缺点：在类加载的时候就实例化，没有达到懒加载的效果，如果从始至终没有使用该类，则造成内存浪费
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance;
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance1 = getInstance();
        Singleton instance2 = getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
