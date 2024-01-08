package src.com.desgin.builder.improve;

public class HouseDirector {
  HouseBuilder houseBuilder = null;

  //
  public HouseDirector(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }
  public void setHouseBuilder(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  // 如何建造
  public House constructHouse() {
    houseBuilder.buildBasic();
    houseBuilder.buildWalls();
    houseBuilder.roofed();
    return houseBuilder.buildHouse();
  }




}
