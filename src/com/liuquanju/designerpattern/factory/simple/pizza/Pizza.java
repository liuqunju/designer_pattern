package com.liuquanju.designerpattern.factory.simple.pizza;

/**
 * 将pizza设计成抽象类
 */
public abstract class Pizza {

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " 进行烘焙。。。");
    }

    public void cut() {
        System.out.println(name + " 进行切割。。。");
    }

    public void box(){
        System.out.println(name + " 进行打包。。。");
    }
}
