package src.com.leetcode.reverseString;

public class ReverseString {
  public static void main(String[] args) {
    char[] s = {'h','e','l','l','o'};
    reverseString(s);

    System.out.println(s);

  }
  public static void reverseString(char[] s) {
    int n = s.length;
    for(int left = 0,right = n - 1;left < right;++left,--right) {
      char temp = s[left];
      s[left] = s[right];
      s[right] = temp;
    }
  }
}
