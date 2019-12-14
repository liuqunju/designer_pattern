package com.liuquanju.designerpattern.singleton.type6;

/**
 * 双重检查，线程安全，推荐使用
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

    private static volatile Singleton instance;

    /**
     * 双重检查，实例化代码只需执行一次避免了反复进行同步
     * 解决了懒加载的同时，避免了多线程问题的发生
     * 在实际开发中，推荐使用
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}