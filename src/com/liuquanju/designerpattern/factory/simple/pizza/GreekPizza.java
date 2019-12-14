package com.liuquanju.designerpattern.factory.simple.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给" + name + " 准备材料。。。");
    }
}
