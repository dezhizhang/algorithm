package src.com.leetcode.maxArea;

public class MaxArea {
  public static void main(String[] args) {
    int[] arr = {1,8,6,2,5,4,8,3,7};
    int i = maxArea(arr);
    System.out.println(i);
  }

  public static int maxArea(int[] height) {
    int l = 0, r = height.length - 1;
    int ans = 0;
    while (l < r) {
      int area = Math.min(height[l],height[r]) * (r - l);
      ans = Math.max(ans,area);

      if(height[l] <= height[r]) {
        ++l;
      }else {
        --r;
      }
    }
    return ans;
  }



}
