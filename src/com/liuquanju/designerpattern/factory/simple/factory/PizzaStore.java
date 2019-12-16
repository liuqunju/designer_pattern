package com.liuquanju.designerpattern.factory.simple.factory;

/**
 * 充当客户端
 */
public class PizzaStore {
    public static void main(String[] args) {
//        OrderPizza orderPizza = new OrderPizza();
        new SimpleOrderPizza(new SimpleFactory());
    }
}
