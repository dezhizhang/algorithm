package src.com.leetcode.smallestRangeI;

import java.util.Arrays;

public class SmallestRangeI {
  public static void main(String[] args) {
    int[] arr = {1};
    int k = 0;
    int i = smallestRangeI(arr, k);

    System.out.println(i);

  }


  public static int smallestRangeI(int[] nums,int k) {
    int minNum = Arrays.stream(nums).min().getAsInt();
    int maxNum = Arrays.stream(nums).max().getAsInt();

    return maxNum - minNum <=2 * k ? 0:maxNum - minNum - 2 * k;
  }

}
