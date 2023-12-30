package src.com.xiaozhicloud.search;

public class InterpolationSearch {
  public static void main(String[] args) {
      int [] arr= new int[100];
      for(int i = 0;i < 100;i++) {
        arr[i] = i + 1;
      }

    int i = interpolationValue(arr, 0, arr.length - 1, 22);

    System.out.println(i);
  }
  // 插值查找算法
  public static int interpolationValue(int[] arr,int left,int right,int findVal) {
    if(left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
      return  -1;
    }

    int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
    int midVal = arr[mid];

    if(findVal > midVal) {
      return  interpolationValue(arr,mid + 1,right,findVal);
    }else if(findVal < midVal) {
      return interpolationValue(arr,left,mid - 1,findVal);
    }else {
      return mid;
    }
  }
}


