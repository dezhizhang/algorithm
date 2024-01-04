package src.com.xiaozhicloud.kmp;

public class Violence {
  public static void main(String[] args) {
    String s1 = "你好刘德华，刘德华 ";
    String s2 = "刘德华";

    int i = violenceMatch(s1, s2);

    System.out.println(i);

  }

  public static int violenceMatch(String str1, String str2) {
    char[] s1 = str1.toCharArray();
    char[] s2 = str2.toCharArray();

    int s1Len = s1.length;
    int s2Len = s2.length;

    int i = 0;
    int j = 0;

    while (i < s1Len && j < s2Len) {
      if (s1[i] == s2[j]) {
        i++;
        j++;
      } else {
        i = i - (j - 1);
        j = 0;
      }
    }

    if (j == s2Len) {
      return i - j;
    }
    return -1;
  }
}
