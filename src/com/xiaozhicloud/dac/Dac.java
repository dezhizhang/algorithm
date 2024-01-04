package src.com.xiaozhicloud.dac;

public class Dac {
  public static void main(String[] args) {
   // tower(32,'A','B','C');
  }

  // 使用分法算法角决
  public static void tower(int num, char a, char b, char c) {
    if (num == 1) {
      System.out.println("第1个盘从" + a + "->" + c);
    } else {
      tower(num - 1, a, c, b);
      System.out.println("第" + num + "个盘从" + a + "->" + c);
      tower(num - 1, b, a, c);
    }


  }
}


