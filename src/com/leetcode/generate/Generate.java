package src.com.leetcode.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generate {
  public static void main(String[] args) {
    List<List<Integer>> generate = generate(10);

    System.out.println(generate);

  }
  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ret = new ArrayList<List<Integer>>();
    for(int i=0;i < numRows;i++) {
      List<Integer> row = new ArrayList<Integer>();
      for(int j=0;j <=i;j++) {
        if(j==0 || j == i) {
          row.add(1);
        }else {
          row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
        }
      }
      ret.add(row);
    }
    return ret;
  }
}
