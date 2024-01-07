package src.com.desgin.single;

class Singleton4Test {

  public static void main(String[] args) {
    Singleton4 singleton4 = Singleton4.getInstance();
    Singleton4 singleton42 = Singleton4.getInstance();

    System.out.println(singleton4 == singleton42);
  }
}

class Singleton4 {
  private static Singleton4 instance;

  private Singleton4() {
  }

  public static synchronized Singleton4 getInstance() {
    if (instance == null) {
      instance = new Singleton4();
    }
    return instance;
  }
}
