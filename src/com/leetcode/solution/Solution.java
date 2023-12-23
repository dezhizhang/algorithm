
//70 爬楼梯
package src.com.leetcode.solution;
import java.util.HashMap;
import java.util.Map;

class SolutionTest {
  public static void main(String[] args) {
    Solution solution = new Solution();
    int result = solution.climbStairs(10);
    System.out.println(result);

  }
}

class Solution{
  private Map<Integer,Integer> storeMap = new HashMap<>();
  public int climbStairs(int n) {
    if(n == 1) return  1;
    if(n == 2) return  2;
    if(storeMap.get(n) != null) {
      return storeMap.get(n);
    }
    int result = climbStairs(n - 1) + climbStairs(n -2);
    storeMap.put(n,result);
    return  result;
  }
}


