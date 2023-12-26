package src.com.xiaozhicloud.sort;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int arr[] = {3,9,-1,10,20};
    int temp = 0;
    boolean flag = false;
    for(int i=0;i < arr.length - 1;i++) {
      flag = false;
      for(int j=0;j < arr.length - 1;j++) {
        if(arr[j] > arr[j + 1]) {
          flag = true;
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      System.out.printf("第(%d)趟排序",i + 1);
      System.out.println();
      if(!flag) {
        break;
      }

    }

    System.out.println(Arrays.toString(arr));
  }

}
