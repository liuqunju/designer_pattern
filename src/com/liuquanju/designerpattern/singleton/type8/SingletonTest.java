package com.liuquanju.designerpattern.singleton.type8;

/**
 * 借助枚举来创建单例，不仅能解决多线程的问题，还能防止反序列化重新创建新的对象
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 ==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton2.hashCode());

    }

}

enum Singleton{
    INSTANCE;
}
