package src.com.desgin.decorator;

public abstract class Drink {
  public String dsc; //描述
  private float price = 0.0f;

  public String getDsc() {
    return dsc;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public void setDsc(String dsc) {
    this.dsc = dsc;
  }

  public float getPrice() {
    return price;
  }

  // 计算费用的抽像方法
  public abstract float cost();
}
