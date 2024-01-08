package src.com.desgin.builder.improve;

public class Client {
  public static void main(String[] args) {
    CommonHouse commonHouse = new CommonHouse();
    HouseDirector houseDirector = new HouseDirector(commonHouse);

    House house = houseDirector.constructHouse();
    house.getBasic();

    HighBuilding highBuilding = new HighBuilding();



  }
}
