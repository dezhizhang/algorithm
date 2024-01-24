package src.com.leetcode.arrayPairSum;

import java.util.Arrays;

public class ArrayPairSum {
  public static void main(String[] args) {
   int[] nums = {1,4,3,2};
    int i = arrayPairSum(nums);
    System.out.println(i);
  }
  public static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int ans = 0;
    for (int i = 0; i < nums.length; i += 2) {
      ans += nums[i];
    }
    return ans;

  }
}
