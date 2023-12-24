package src.com.leetcode.movezero;

import java.util.Arrays;

public class MoveZero {
  public static void main(String[] args) {
    int[] nums =  {0,1,0,3,12};
    moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void moveZeroes(int[] nums) {
    if(nums == null) {
      return;
    }
    int j = 0;
    for(int i=0;i < nums.length;i++) {
      if(nums[i]!= 0) {
        nums[j++] = nums[i];
      }
    }
    for(int i=j;i < nums.length;i++) {
      nums[i] = 0;
    }
  }
}
