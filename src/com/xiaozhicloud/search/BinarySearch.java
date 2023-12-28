package src.com.xiaozhicloud.search;

public class BinarySearch {
  public static void main(String[] args) {
    int arr[] = {1,8,10,89,1000,1234};
    int i = binarySearch(arr,0,arr.length -1, 88);
    System.out.println(i);

  }

  public static int binarySearch(int[]arr,int left,int right,int findValue) {
    if(left > right) return  -1;
    int mid = (left + right) / 2;
    int midValue = arr[mid];


    if(findValue > midValue) {
      return  binarySearch(arr,mid +1,right,findValue);
    }

    if(findValue < midValue) {
      return binarySearch(arr,left,mid - 1,findValue);
    }

    return mid;

  }
}
