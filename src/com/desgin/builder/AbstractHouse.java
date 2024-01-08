package src.com.desgin.builder;

public abstract class AbstractHouse {
  // 打地基
  public abstract void buildBasic();
  // 砌啬
  public abstract void buildWalls();
  // 封顶
  public abstract void roofed();

  public void build() {
    buildBasic();
    buildWalls();
    roofed();
  }


}
