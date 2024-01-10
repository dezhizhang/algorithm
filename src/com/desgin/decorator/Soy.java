package src.com.desgin.decorator;

public class Soy extends Decorator{
  public Soy(Drink obj) {
    super(obj);
    setDsc("豆浆");
    setPrice(1.5f);
  }
}
