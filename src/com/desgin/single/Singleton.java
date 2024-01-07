package src.com.desgin.single;

class SingletonTest {
  public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    System.out.println(instance == singleton2);

  }
}

class  Singleton{
  // 构造器私有化,外部不能new
  private Singleton() {

  }
  private final static Singleton instance = new Singleton();

  public static Singleton getInstance() {
    return  instance;
  }

}


