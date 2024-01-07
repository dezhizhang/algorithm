package src.com.desgin.improve;

public class Improve {
  public static void main(String[] args) {

  }
}

interface Interface1 {
  void operation1();
}

interface Interface2{
  void operation2();
  void operation3();
}

interface Interface3{
  void operation4();
  void operation5();
}


class A implements Interface1 {

  @Override
  public void operation1() {

  }
}

class B implements Interface1,Interface2{

  @Override
  public void operation1() {

  }

  @Override
  public void operation2() {

  }

  @Override
  public void operation3() {

  }
}

class D implements Interface1,Interface3{

  @Override
  public void operation1() {

  }

  @Override
  public void operation4() {

  }

  @Override
  public void operation5() {

  }
}


