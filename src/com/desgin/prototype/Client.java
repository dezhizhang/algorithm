package src.com.desgin.prototype;

public class Client {
  public static void main(String[] args) {
    Sheep sheep = new Sheep("tom", 1, "白色");
    Object clone = sheep.clone();
    System.out.println(clone);

  }
}
