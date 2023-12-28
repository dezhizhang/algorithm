package src.com.xiaozhicloud.sort;

import java.util.Arrays;

public class InsertSort {
  public static void main(String[] args) {
    int[] arr = {101, 34, 119, 1,-1,89};
    insertSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void insertSort(int[] arr) {
    for(int i=1;i < arr.length;i++) {
      int insetVal =arr[i];
      int insetIndex = i - 1;
      while (insetIndex >=0 && insetVal < arr[insetIndex]) {
        arr[insetIndex + 1] = arr[insetIndex];
        insetIndex--;
      }
      arr[insetIndex + 1] = insetVal;
    }
  }
}
