package src.com.desgin.single;

class Singleton3Test {
  public static void main(String[] args) {
    Singleton3 instance = Singleton3.getInstance();
    Singleton3 instance2 = Singleton3.getInstance();
    System.out.println(instance == instance2);

  }
}

class Singleton3{
  private static Singleton3 instance;

  private Singleton3(){}

  public static Singleton3 getInstance() {
    if(instance == null) {
      instance = new Singleton3();
    }
    return instance;
  }
}
