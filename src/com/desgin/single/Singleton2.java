package src.com.desgin.single;

class Singleton2Test {
  public static void main(String[] args) {
    Singleton2 instance = Singleton2.getInstance();

    System.out.println(instance);
  }
}

class Singleton2 {
  private Singleton2() {

  }
  private static Singleton2 instance;

  static {
    // 创建单例对像，在静态代码块里
    instance = new Singleton2();
  }

  public static Singleton2 getInstance() {
    return instance;
  }
}
