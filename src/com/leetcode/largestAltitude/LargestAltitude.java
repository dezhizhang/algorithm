package src.com.leetcode.largestAltitude;

public class LargestAltitude {
  public static void main(String[] args) {
//    largestAltitude();
  }
  public static int largestAltitude(int[] gain) {
    int ans = 0, sum = 0;
    for (int x : gain) {
      sum += x;
      ans = Math.max(ans, sum);
    }
    return ans;
  }
}
