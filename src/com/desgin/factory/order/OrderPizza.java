package src.com.desgin.factory.order;

import src.com.desgin.factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
  public OrderPizza(SimpleFactory simpleFactory) {
    setFactory(simpleFactory);
  }
  SimpleFactory simpleFactory;
  Pizza pizza = null;
  public void setFactory(SimpleFactory simpleFactory) {
    String orderType = "";
    this.simpleFactory = simpleFactory;

    do{
      orderType = getType();
      pizza = this.simpleFactory.createPizza(orderType);

      if(pizza != null) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
      }else {
        System.out.println("订购失败");
      }
    }while (true);
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
