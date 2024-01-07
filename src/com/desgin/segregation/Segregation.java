package src.com.desgin.segregation;

public class Segregation {
  public static void main(String[] args) {

  }
}

interface Interface {
  void operation1();
  void operation2();
  void operation3();

  void operation4();
  void operation5();
}

class B implements Interface{

  @Override
  public void operation1() {

  }

  @Override
  public void operation2() {

  }

  @Override
  public void operation3() {

  }

  @Override
  public void operation4() {

  }

  @Override
  public void operation5() {

  }
}

class D implements Interface{

  @Override
  public void operation1() {

  }

  @Override
  public void operation2() {

  }

  @Override
  public void operation3() {

  }

  @Override
  public void operation4() {

  }

  @Override
  public void operation5() {

  }
}

class A{
  public void depend1(Interface i) {
    i.operation1();
  }
  public void depend2(Interface i) {
    i.operation2();
  }

  public  void depend3(Interface i) {
    i.operation3();
  }
}

class C{
  public void depend1(Interface i) {
    i.operation1();
  }
  public void depend4(Interface i) {
    i.operation4();
  }
  public void depend5(Interface i) {
    i.operation5();
  }
}
