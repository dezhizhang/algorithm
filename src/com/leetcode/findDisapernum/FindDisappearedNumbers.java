package src.com.leetcode.findDisapernum;

import java.util.ArrayList;
import java.util.List;

class FindDisappearedNumbersTest {
  public static void main(String[] args) {
    int[]nums =  {4,3,2,7,8,2,3,1};
    List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
    System.out.println(disappearedNumbers);

  }
  public static List<Integer> findDisappearedNumbers(int[] nums) {
    int n = nums.length;
    for(int num:nums) {
      int x = (num - 1) % n;
      nums[x] += n;
    }
    List<Integer> result = new ArrayList<Integer>();
    for(int i=0;i < n;i++) {
      if(nums[i] <=n) {
        result.add(i + 1);
      }
    }
    return  result;
  }

}
