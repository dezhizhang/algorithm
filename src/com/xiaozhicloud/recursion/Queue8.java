package src.com.xiaozhicloud.recursion;

public class Queue8 {
  int max = 8;
  int[] array = new int[max];
  public static void main(String[] args) {

  }

  private boolean judge(int n) {
    for(int i = 0;i < n;i++) {
      if(array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
        return  false;
      }
    }
    return true;
  }

  private void print() {
    for(int i=0;i < array.length;i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

}
