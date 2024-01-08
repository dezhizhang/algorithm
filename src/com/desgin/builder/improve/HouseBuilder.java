package src.com.desgin.builder.improve;

public abstract class HouseBuilder {
  protected House house = new House();

  public abstract void buildBasic();
  public abstract void buildWalls();

  public abstract void roofed();

  // 建造房子
  public House buildHouse() {
    return house;
  }

}
