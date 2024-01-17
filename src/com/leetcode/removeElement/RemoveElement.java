package src.com.leetcode.removeElement;

public class RemoveElement {
  public static void main(String[] args) {
    int[] nums = {3,2,2,3};
    int val = 3;
    int i = removeElement(nums, val);

    System.out.println(i);

  }

  public static int removeElement(int[] nums,int val) {
    int left = 0;
    int n = nums.length;
    for(int right = 0;right < n;right++) {
      if(nums[right] != val) {
        nums[left] = nums[right];
        left++;
      }
    }
    return  left;
  }
}
