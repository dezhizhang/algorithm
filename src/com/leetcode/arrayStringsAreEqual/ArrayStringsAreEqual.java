package src.com.leetcode.arrayStringsAreEqual;

import java.util.Map;

public class ArrayStringsAreEqual {
  public static void main(String[] args) {

  }
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    return join(word1).equals(join(word2));
  }
  public String join(String[] words) {
    StringBuilder ret = new StringBuilder();
    for (String s : words) {
      ret.append(s);
    }
    return ret.toString();
  }

}
