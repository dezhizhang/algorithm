package src.com.desgin.inversion;

public class Improve {
  public static void main(String[] args) {
      Person person = new Person();
      person.receive(new Email());
  }
}

interface IReceiver{
  public String getInfo();
}

class Email implements IReceiver{

  @Override
  public String getInfo() {
    return "电子邮箱:hello world";
  }
}


class Person{
  public void receive(IReceiver receiver) {
    System.out.println(receiver.getInfo());
  }
}

