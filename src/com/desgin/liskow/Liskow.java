package src.com.desgin.liskow;

public class Liskow {
  public static void main(String[] args) {
     B b = new B();
    int i = b.func1(11, 3);
    int i2 = b.func2(11,3);
    System.out.println(i);
    System.out.println(i2);

  }
}


class A {
  public int func1(int num1,int num2) {
    return num1 - num2;
  }
}

class B extends A {
  @Override
  public int func1(int num1, int num2) {
    return num1 + num2;
  }

  public int func2(int a,int b) {
    return func1(a,b) + 9;
  }

}
