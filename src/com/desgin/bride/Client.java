package src.com.desgin.bride;

public class Client {
  public static void main(String[] args) {
    Phone phone = new FoldedPhone(new XiaoMi());
    phone.open();
    phone.call();
    phone.close();
  }
}
