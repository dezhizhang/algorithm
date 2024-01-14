package src.com.leetcode.countBits;

import java.util.Arrays;

public class CountBits {
  public static void main(String[] args) {
    int[] ints = countBits(2);
    System.out.println(Arrays.toString(ints));
  }
  public static int[] countBits(int n) {
      int[] bits = new int[n+1];
      for(int i=1;i <=n;i++) {
        bits[i] = bits[i &(i-1)] +1;
      }
      return bits;
  }
}
