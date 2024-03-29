package src.com.desgin.prototype;

public class Sheep implements Cloneable {
  private String name;
  private int age;
  private String color;
  public Sheep(String name,int age,String color) {
    super();
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }
  public void  setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return this.name + this.age + this.color;
  }

  @Override
  protected Object clone() {
    Sheep sheep = null;
    try{
      sheep = (Sheep) super.clone();
    }catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return sheep;
  }
}
