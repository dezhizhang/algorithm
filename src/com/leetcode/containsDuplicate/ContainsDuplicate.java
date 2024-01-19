package src.com.leetcode.containsDuplicate;

import java.util.Arrays;

public class ContainsDuplicate {
  public static void main(String[] args) {
    int[] arr = {1,2,3,1};
    boolean b = containsDuplicate(arr);
    System.out.println(b);

  }

  public static boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    for(int i=0;i < n - 1;i++) {
      if(nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return  false;
  }

}
