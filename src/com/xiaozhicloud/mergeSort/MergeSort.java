package src.com.xiaozhicloud.mergeSort;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
      int arr[] = {8,4,5,7,1,3,6,2};
      int temp[] = new int[arr.length];
      mergeSort(arr,0,arr.length - 1,temp);

      System.out.println(Arrays.toString(temp));
  }

  public static void mergeSort(int[]arr,int left,int right,int[] temp) {
    if(left < right) {
      int mid = (left + right) / 2;
      mergeSort(arr,left,mid,temp);
      mergeSort(arr,mid + 1,right,temp);
      merge(arr,left,mid,right,temp);
    }
  }
  // 合并的方法
  public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
    int i = left; // 初始化id
    int j = mid + 1;
    int t = 0;


    while (i < mid && j <= right) {
      if (arr[i] < arr[j]) {
        temp[t] = arr[i];
        t += 1;
        i += 1;
      } else {
        temp[t] = arr[j];
        t += 1;
        j += 1;

      }
    }

    // 把有剩余的数据全填充到temp中
    while (i <= mid) {
      temp[t] = arr[i];
      t += 1;
      i += 1;
    }

    // 右边的有序序列填充到temp中
    while (j <= right) {
      temp[t] = arr[j];
      t += 1;
      j += 1;
    }

    t = 0;
    int tempLeft = left;
    while (tempLeft <= right) {
      arr[tempLeft] = temp[t];
      t += 1;
      tempLeft += 1;
    }


  }

}
