package src.com.leetcode.missingNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
  public static void main(String[] args) {
    int[] nums = {0,1,3};
    int i = missingNumber(nums);
    System.out.println(i);

  }
  public static int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    for(int i=0;i < n;i++) {
      if(nums[i] != i) {
        return i;
      }
    }
    return n;
  }
}
