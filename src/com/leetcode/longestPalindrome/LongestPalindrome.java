package src.com.leetcode.longestPalindrome;

import java.util.Arrays;

public class LongestPalindrome {
  public static void main(String[] args) {
    String s = "abccccdd";
    int i = longestPalindrome(s);
    System.out.println(i);
  }
  public static int longestPalindrome(String s) {

    int[] count = new int[128];
    int length = s.length();
    for(int i=0;i < length;i++) {
      char c = s.charAt(i);
      count[c]++;
    }

    int ans = 0;
    for(int v:count) {
      ans += v / 2 * 2;
      if(v %2 == 1 && ans %2 == 0) {
        ans++;
      }
    }
    return ans;
  }

}
