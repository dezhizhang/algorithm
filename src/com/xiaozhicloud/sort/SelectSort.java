package src.com.xiaozhicloud.sort;

import java.util.Arrays;

public class SelectSort {
  public static void main(String[] args) {
    int[] arr = {101, 34, 199, 1,90,123};
    selectSort(arr);
  }

  public static void selectSort(int[]arr) {
    for(int i=0;i < arr.length - 1;i++) {
      int minIndex = i;
      int min = arr[minIndex];
      for(int j=i + 1;j < arr.length;j++) {
        if(min > arr[j]) {
          min = arr[i];
          minIndex = j;
        }
      }
      if(minIndex != i) {
        arr[minIndex] = arr[i];
        arr[i] = min;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

}
