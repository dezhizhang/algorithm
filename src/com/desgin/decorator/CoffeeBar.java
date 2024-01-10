package src.com.desgin.decorator;

public class CoffeeBar {
  public static void main(String[] args) {
    Drink order = new LongBlack();
    System.out.println("费用 1"+ order.cost());
    System.out.println("描述=" + order.getDsc());


    order = new Milk(order);
    System.out.println("费用 1" + order.cost());
    System.out.println("描述=" + order.getDsc());


    order = new Chocolate(order);
    System.out.println("费用 1" + order.cost());
    System.out.println("描述=" + order.getDsc());
  }

}
