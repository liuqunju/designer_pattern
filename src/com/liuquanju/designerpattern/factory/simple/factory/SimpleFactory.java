package com.liuquanju.designerpattern.factory.simple.factory;

import com.liuquanju.designerpattern.factory.simple.pizza.CheessPizza;
import com.liuquanju.designerpattern.factory.simple.pizza.GreekPizza;
import com.liuquanju.designerpattern.factory.simple.pizza.Pizza;

/**
 * 简单工厂
 *
 * @author yingj
 */
public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("chess")) {
            pizza = new CheessPizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else {
            return pizza;
        }
        return pizza;
    }


}
