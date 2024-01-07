package src.com.desgin.single;

class Singleton6Test {
  public static void main(String[] args) {
    Singleton6 instance = Singleton6.getInstance();
    Singleton6 instance2 = Singleton6.getInstance();

    System.out.println(instance ==instance2);
  }
}

// 静态内部类单例模式
class Singleton6{
  private static volatile Singleton6 instance;

  private static class Singleton6Instance {
    private static final Singleton6 INSTANCE = new Singleton6();
  }

  // 提供一个静态公共方法
  public static synchronized Singleton6 getInstance() {
    return Singleton6Instance.INSTANCE;
  }


}
