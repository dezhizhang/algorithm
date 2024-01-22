package src.com.leetcode.arrayRankTransform;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRankTransform {
  public static void main(String[] args) {
    int[] arr = {40,10,20,30};
    int[] ints = arrayRankTransform(arr);
    System.out.println(Arrays.toString(ints));
  }

  public static int[] arrayRankTransform(int[] arr) {
    int[] sortedArr = new int[arr.length];
    System.arraycopy(arr,0,sortedArr,0,arr.length);
    Arrays.sort(sortedArr);

    Map<Integer,Integer> ranks = new HashMap<Integer,Integer>();
    int[] ans = new int[arr.length];

    for(int a:sortedArr) {
      if(!ranks.containsKey(a)) {
        ranks.put(a,ranks.size() + 1);
      }
    }

    for(int i=0;i < arr.length;i++) {
      ans[i] = ranks.get(arr[i]);
    }
    return ans;


  }
}
