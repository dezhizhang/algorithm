package src.com.desgin.factory.order;

import src.com.desgin.factory.pizza.CheesePizza;
import src.com.desgin.factory.pizza.GreekPizza;
import src.com.desgin.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
  public OrderPizza() {
    Pizza pizza = null;
    String orderType; // 订购披萨类型
    do {
      orderType = getType();
      if (orderType.equals("greek")) {
        pizza = new GreekPizza();
        pizza.setName(orderType);
      } else if (orderType.equals("cheese")) {
        pizza = new CheesePizza();
        pizza.setName(orderType);
      } else {
        break;
      }
      pizza.prepare();
      pizza.bake();
      pizza.cut();
      pizza.bake();
    } while (true);
  }

  // 获取客户订购披萨种类
  private String getType() {
    try {
      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("input pizza type:");
      String str = buffer.readLine();
      return str;
    } catch (IOException e) {
      e.printStackTrace();
      return "";
    }
  }
}
