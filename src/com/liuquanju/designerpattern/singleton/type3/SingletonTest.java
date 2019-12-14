package com.liuquanju.designerpattern.singleton.type3;

/**
 * 懒汉式
 * 优点：在运行时第一次需要用到时才进行实例化，达到懒加载效果
 * 缺点：线程不安全，在多线程情况下，如果第一个线程进入if还没来得及往下执行
 * 第二个线程也进入了if，则两个线程都创建了实例
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

class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    // 在程序第一次需要使用时才创建实例，达到懒汉式的效果（即懒加载）
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
