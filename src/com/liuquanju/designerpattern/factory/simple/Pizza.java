package com.liuquanju.designerpattern.factory.simple;

/**
 * 将pizza设计成抽象类
 */
public abstract class Pizza {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    protected abstract String prepare();

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
