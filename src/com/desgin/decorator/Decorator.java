package src.com.desgin.decorator;

public class Decorator extends  Drink{
  @Override
  public float cost() {
    return super.getPrice();
  }
}
