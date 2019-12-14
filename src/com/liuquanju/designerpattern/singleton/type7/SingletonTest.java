package com.liuquanju.designerpattern.singleton.type7;

/**
 * 静态内部类
 * 优点：在Sinleton类进行加载的时候不会导致静态内部类进行加载，从而不会使Sinleton实例化
 * 在调用Singleton的静态方法时导致内部类被加载才对Singleton进行实例化，达到了懒加载的效果，且在内部类进行
 * 加载时线程时安全的，不会出现线程安全性问题。
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
    // 提供私有构造器，防止被new产生新对象
    private Singleton(){}

    private static class InnerSingleton{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return InnerSingleton.INSTANCE;
    }

}
