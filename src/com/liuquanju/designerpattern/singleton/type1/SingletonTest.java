package com.liuquanju.designerpattern.singleton.type1;


import com.liuquanju.designerpattern.singleton.type1.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
