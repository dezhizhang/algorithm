package src.com.leetcode.mostWordsFound;

public class MostWordsFound {
  public static void main(String[] args) {
    String[] arr = {"alice and bob love leetcode","i think so too","this is great thanks very much"};

    int i = mostWordsFound(arr);
    System.out.println(i);

  }
  public static int mostWordsFound(String[] sentences) {
    int res = 0;
    for(int i=0;i < sentences.length;i++) {
      String[] cur = sentences[i].split(" ");
      res = Math.max(res,cur.length);
    }
    return res;

  }
}
