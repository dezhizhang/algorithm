package src.com.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

class TwoSumTest {
  public static void main(String[] args) {
      int[] nums = {2,7,11,15};
      int target = 9;
      int[] result = twoSum1(nums, target);
      System.out.println(result[0]);
      System.out.println(result[1]);

  }

  public static int[] twoSum(int[] nums,int target) {
    int[] result = new int[2];
    for(int  i=0;i < nums.length;i++) {
      for(int j=i+1;j < nums.length;j++) {
        if(nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
        }
      }
    }
    return  result;
  }

  // 通过哈希map来计算
  public static int[] twoSum1(int[] nums,int target) {
    int[] result = new int[2];
    Map<Integer,Integer> storeNums = new HashMap<>(nums.length);

    for(int i=0;i < nums.length;i++) {
      int another = target - nums[i];
      Integer anotherIndex = storeNums.get(another);
      if(anotherIndex != null) {
        result[0] = anotherIndex;
        result[1] = i;
        break;
      }
      storeNums.put(nums[i],i);
    }
    return result;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
