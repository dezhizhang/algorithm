package src.com.desgin.single;

public class SingleResponse {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();

    vehicle.run("小汽车");

  }
}


class Vehicle{
  public void run(String vehicle) {
    System.out.println(vehicle + "在公路上运行...");
  }
}


