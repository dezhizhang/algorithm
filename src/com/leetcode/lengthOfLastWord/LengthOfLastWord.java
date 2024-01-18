package src.com.leetcode.lengthOfLastWord;

public class LengthOfLastWord {
  public static void main(String[] args) {
    String str = "Hello World hello ";
//    System.out.println(str.length());
    int i = lengthOfLastWord(str);
    System.out.println(i);

  }


  public static int lengthOfLastWord(String s) {
    int index = s.length() - 1;
    while (s.charAt(index) == ' ') {
      System.out.println("hello");
      index--;
    }

    int wordLength = 0;
    while (index >=0 && s.charAt(index) != ' ') {
      wordLength++;
      index--;
    }
    return wordLength;
  }
}
