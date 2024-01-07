package src.com.desgin.single;

class Singleton7Test {
  public static void main(String[] args) {
    Singleton7 instance = Singleton7.INSTANCE;
    Singleton7 instance2 = Singleton7.INSTANCE;

    System.out.println(instance == instance2);

  }
}


enum  Singleton7{
  INSTANCE;
  public void sayOk() {
    System.out.println("ok");
  }
}
