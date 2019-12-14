package com.liuquanju.designerpattern.factory.simple.factory;

import com.liuquanju.designerpattern.factory.simple.factory.OrderPizzaFactory;

/**
 * 充当客户端
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizzaFactory orderPizza = new OrderPizzaFactory();
    }
}
