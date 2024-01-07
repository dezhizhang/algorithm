package src.com.desgin.single;

class Singleton5Test {
  public static void main(String[] args) {
    Singleton5 singleton = Singleton5.getInstance();
    Singleton5 singleton2 = Singleton5.getInstance();

    System.out.println(singleton == singleton2);
  }
}

class Singleton5{
  private static volatile Singleton5 instance;

  private Singleton5() {};

  public static synchronized Singleton5 getInstance() {
    if(instance == null) {
      synchronized (Singleton5.class) {
        if(instance == null) {
          instance = new Singleton5();
        }
      }
    }
    return instance;
  }

}
