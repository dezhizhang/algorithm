package src.com.leetcode.containsNearbyDuplicate;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {
  public static void main(String[] args) {
    int[] arr = {1,2,3,1};
    int k = 3;
    boolean b = containsNearbyDuplicate(arr, k);
    System.out.println(b);

  }
  public static boolean containsNearbyDuplicate(int[] nums, int k) {

    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    int length = nums.length;
    for(int i=0;i < length;i++) {
      int num = nums[i];
      if(map.containsKey(num) && i - map.get(num) <=k) {
        return true;
      }
      map.put(num,i);
    }
    return false;
  }


}
