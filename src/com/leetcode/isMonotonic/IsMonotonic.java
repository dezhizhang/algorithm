package src.com.leetcode.isMonotonic;

public class IsMonotonic {
  public static void main(String[] args) {
    int[] nums = {1,2,2,3};
    boolean monotonic = isMonotonic(nums);
    System.out.println(monotonic);

  }

  public static boolean isMonotonic(int[] nums) {
    boolean inc = true, dec = true;
    int n = nums.length;
    for(int i=0;i < n - 1;i++) {
      if(nums[i] > nums[i + 1]) {
        inc = false;
      }
      if(nums[i] < nums[i + 1]) {
        dec = false;
      }
    }
    return inc || dec;
  }

}
