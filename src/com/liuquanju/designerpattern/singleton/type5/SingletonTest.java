package com.liuquanju.designerpattern.singleton.type5;

/**
 * 懒汉式（同步代码块，线程不安全）
 * 在多线程模式下，当第一个线程进入到if里面还没来得及往下执行时，第二个线程也进入到if，会创建两个实例
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

    /**
     * 在多线程模式下，当第一个线程进入到if里面还没来得及往下执行时，第二个线程也进入到if，会创建两个实例
     * 在实际开发中，不能使用
     * @return
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }


}
