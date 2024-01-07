package src.com.desgin.prototype;

public class Client2 {
  public static void main(String[] args) throws Exception {
    DeepProtoType deepProtoType = new DeepProtoType();
    deepProtoType.name = "宋江";
    deepProtoType.deepCloneTable = new DeepCloneTable("大牛","大牛类");

    Object clone = (DeepProtoType) deepProtoType.deepClone();

    System.out.println(deepProtoType.hashCode());
    System.out.println(deepProtoType.name);
    System.out.println(clone.hashCode());
    System.out.println(clone.getClass().getName());

  }
}
