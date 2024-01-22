package src.com.leetcode.findMaxConsecutiveOnes;

import src.com.leetcode.maxArea.MaxArea;

public class FindMaxConsecutiveOnes {
  public static void main(String[] args) {
    int[] nums = {1,0,1,1,0,1};
    int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
    System.out.println(maxConsecutiveOnes);

  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int maxCount = 0, count = 0;
    int n = nums.length;
    for(int i=0;i < n;i++) {
      if(nums[i] == 1) {
        count++;
      }else {
        maxCount = Math.max(maxCount,count);
        count = 0;
      }
    }
    maxCount = Math.max(maxCount,count);
    return maxCount;
  }

}
