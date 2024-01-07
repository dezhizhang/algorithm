package src.com.desgin.factory.order;

import src.com.desgin.factory.pizza.GreekPizza;
import src.com.desgin.factory.pizza.Pizza;

public class SimpleFactory {
  public Pizza createPizza(String orderType) {
    Pizza pizza = null;
    System.out.println("使用简单工厂模式");
    if(orderType.equals("greek")) {
      pizza = new GreekPizza();
      pizza.setName("");
    }
    return  pizza;
  }
}
