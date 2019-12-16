package com.liuquanju.designerpattern.factory.simple.factory;

import com.liuquanju.designerpattern.factory.simple.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 充当工厂，负责创建格式Pizza
 */
public class SimpleOrderPizza {
    public SimpleOrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    private SimpleFactory simpleFactory;
    private Pizza pizza = null;
    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String pizzaType = "";
        this.simpleFactory = simpleFactory;
        do {
            pizzaType = getType();
            pizza = this.simpleFactory.createPizza(pizzaType);
            if (pizza != null){
                outputBehavior(pizzaType, pizza);
            } else{
                System.out.println("订购披萨失败。。。");
                break;
            }
        } while (true);
    }

    private void outputBehavior(String type, Pizza pizza) {
        pizza.setName(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
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
