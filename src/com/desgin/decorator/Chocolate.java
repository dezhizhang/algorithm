package src.com.desgin.decorator;

public class Chocolate extends Decorator{

  public Chocolate(Drink obj) {
    super(obj);
    setDsc("巧克力");
    setPrice(3.0f);
  }
}
