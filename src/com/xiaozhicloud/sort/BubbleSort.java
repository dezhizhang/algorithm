package src.com.xiaozhicloud.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
  public static void main(String[] args) {
//    int arr[] = {3,9,-1,10,20};

    int max = 80000;
    int[] arr = new int[max];
    for(int i=0;i < max;i++) {
      arr[i] = (int)(Math.random() * max);
    }

    Date date1 = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String s = simpleDateFormat.format(date1);
    System.out.println(s);

    bubbleSort(arr);
    Date date2 = new Date();
    String s2 = simpleDateFormat.format(date2);
    System.out.println(s2);


//
//    System.out.println(Arrays.toString(arr));
  }

  public static int[] bubbleSort(int[] arr) {
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

      if(!flag) {
        break;
      }

    }
    return arr;
  }

}
