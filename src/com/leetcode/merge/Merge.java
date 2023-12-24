package src.com.leetcode.merge;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge {
  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    int m = 3;
    int[] nums2 = {2,5,6};
    int n= 3;
    merge(nums1,m,nums2,n);

    for(int i=0;i < nums1.length;i++) {
      System.out.println(nums1[i]);
    }


  }
  public static void merge(int[] nums1,int m,int[] num2,int n) {
    for(int i=0;i < n;i++) {
      nums1[m + i] = num2[i];
    }
    Arrays.sort(nums1);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}


