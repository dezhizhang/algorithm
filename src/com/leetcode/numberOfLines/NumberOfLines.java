package src.com.leetcode.numberOfLines;

import java.util.Arrays;

public class NumberOfLines {
  public static void main(String[] args) {
    int[] arr = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    String s = "abcdefghijklmnopqsssdffdsfsrstuvwxyz";

    int[] ints = numberOfLines(arr, s);

    System.out.println(Arrays.toString(ints));

  }

  public static final int MAX_WIDTH = 100;

 public static int[] numberOfLines(int[]widths,String s) {
   int lines = 1;
   int width = 0;
   for(int i=0;i < s.length();i++) {
     int need = widths[s.charAt(i) - 'a'];
     width += need;
     if(width > MAX_WIDTH) {
       lines++;
       width = need;
     }
   }
   return new int[]{lines,width};
 }

}
