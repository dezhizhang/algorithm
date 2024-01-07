package src.com.desgin.prototype;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {
  public String name;
  public DeepCloneTable deepCloneTable;

  public DeepProtoType() {
    super();
  }
  // 深拷贝

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Object deep = null;
    deep = super.clone();

    DeepProtoType deepProtoType = (DeepProtoType) deep;
    deepProtoType.deepCloneTable = (DeepCloneTable) deepCloneTable.clone();
    return deepProtoType;
  }

  public Object deepClone() {
    ByteArrayOutputStream bos = null;
    ObjectOutputStream oss = null;
    ByteArrayInputStream bis = null;
    ObjectInputStream ois = null;
    try {
      bos = new ByteArrayOutputStream();
      oss = new ObjectOutputStream(bos);
      oss.writeObject(this);

      // 反序化
      bis = new ByteArrayInputStream(bos.toByteArray());
      ois = new ObjectInputStream(bis);
      DeepProtoType copyObj = (DeepProtoType) ois.readObject();

      return copyObj;

    } catch (Exception e) {
      System.out.println(e.getMessage());
      return null;
    } finally {
      try {
        bos.close();
        ois.close();
        oss.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

  }
}
