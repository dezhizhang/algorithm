package src.com.leetcode.plusOne;

import java.util.Arrays;

public class PlusOne {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    int[] ints = plusOne(arr);
    System.out.println(Arrays.toString(ints));
  }
  public static int[] plusOne(int[] digits) {
    int n = digits.length;
    for(int i=n - 1;i >=0;i--) {
      if(digits[i] != 9) {
        digits[i]++;
        for(int j=i + 1;j < n;j++) {
          digits[j] = 0;
        }
        return digits;
      }
    }
    int[] ans = new int[n + 1];
    ans[0] = 1;
    return ans;
  }

}
