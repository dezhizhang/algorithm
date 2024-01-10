package src.com.desgin.decorator;

public class Milk extends Decorator {
  public Milk(Drink obj) {
    super(obj);
    setDsc("牛奶");
    setPrice(2.0f);
  }
}
