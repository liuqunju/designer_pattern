package com.liuquanju.designerpattern.factory.simple.factory;

import com.liuquanju.designerpattern.factory.simple.pizza.CheessPizza;
import com.liuquanju.designerpattern.factory.simple.pizza.GreekPizza;
import com.liuquanju.designerpattern.factory.simple.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 充当工厂，负责创建格式Pizza
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String pizzaType;

        do {
            pizzaType = getType();
            if (pizzaType.equals("chess")) {
                pizza = new CheessPizza();
            } else if (pizzaType.equals("greek")) {
                pizza = new GreekPizza();
            } else {
                break;
            }
            pizza.setName(pizzaType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);

    }

    private String getType(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入需要制作的披萨:");
            String str = reader.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "none";
    }
}
