package src.com.desgin.builder.improve;

public class HighBuilding extends HouseBuilder{
  @Override
  public void buildBasic() {
    System.out.println("高楼打地基100m");
  }

  @Override
  public void buildWalls() {
    System.out.println("高楼的砌增20cm");
  }

  @Override
  public void roofed() {
    System.out.println("高楼的层顶");
  }
}
