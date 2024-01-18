package src.com.leetcode.thirdMax;

import java.util.Arrays;

public class ThirdMax {
  public static void main(String[] args) {
    int[] arr = {3,2,1};
    int i = thirdMax(arr);
    System.out.println(i);

  }
  public static int thirdMax(int[] nums) {
    Arrays.sort(nums);
    reverse(nums);

    for(int i=1,diff = 1;i < nums.length;i++) {
      if(nums[i] != nums[i - 1] && ++diff == 3) {
        return nums[i];
      }
    }
    return nums[0];
  }
  public static void reverse(int[] nums) {
    int left = 0,right = nums.length - 1;
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }
}
