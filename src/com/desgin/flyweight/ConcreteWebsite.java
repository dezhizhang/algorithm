package src.com.desgin.flyweight;

public class ConcreteWebsite extends WebSite{
  private String type = ""; // 网站类型

  public ConcreteWebsite(String type) {
    this.type = type;
  }

  @Override
  public void use() {
    System.out.println("网站的发布形式为:" + type);
  }
}
