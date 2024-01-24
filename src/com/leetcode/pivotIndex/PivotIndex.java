package src.com.leetcode.pivotIndex;

import java.util.Arrays;

public class PivotIndex {
  public static void main(String[] args) {
    int[] arr = {1,7,3,6,5,6};
    int i = pivotIndex(arr);
    System.out.println(i);
  }
  public static int pivotIndex(int[] nums) {

    int total = Arrays.stream(nums).sum();
    int sum = 0;
    for(int i=0;i < nums.length;i++) {
      if(2 * sum + nums[i] == total) {
        return i;
      }
      sum+= nums[i];
    }
    return  -1;
  }
}
