package src.com.leetcode.findKthPositive;

public class FindKthPositive {
  public static void main(String[] args) {
    int[] arr = {2,3,4,7,11};
    int k = 5;
    System.out.println(findKthPositive(arr,k));
  }
  public static int findKthPositive(int[] arr, int k) {


    if(arr[0] > k) {
      return  k;
    }
    int l = 0,r = arr.length;
    while (l < r) {
      int mid = (l + r) >> 1;
      int x = mid < arr.length ? arr[mid]:Integer.MAX_VALUE;
      if(x - mid - 1 > k) {
        r = mid;
      }else {
        l = mid + 1;
      }
    }
    return k - (arr[l - 1] - (l - 1)) + arr[l - 1];
  }



}
