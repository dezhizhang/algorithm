package src.com.desgin.decorator;

public class Decorator extends Drink {
  private Drink obj;

  public Decorator(Drink obj) {
    this.obj = obj;
  }

  @Override
  public float cost() {
    return super.getPrice() + obj.cost();
  }

  @Override
  public String getDsc() {
    return super.getDsc() + "" + super.getPrice() + "&&" + obj.getDsc();
  }
}
