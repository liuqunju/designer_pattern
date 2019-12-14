package com.liuquanju.designerpattern.singleton.type4;

/**
 * 懒汉式（线程安全）
 * 优点：在第一次使用时创建实例且线程安全
 * 缺点：效率太低，每次调用获取实例的方法时都加锁
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 ==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
class Singleton{
    private Singleton(){}

    private static Singleton instance;

    /**
     * 在程序第一次使用时进行实例化，达到懒加载效果，且进行同步，线程安全
     * 但是效率太低，每次调用时都进行加锁，实际上只需在第一次时进行加锁
     */
    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
