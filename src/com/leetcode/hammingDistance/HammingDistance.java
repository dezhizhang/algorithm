package src.com.leetcode.hammingDistance;

public class HammingDistance {
  public static void main(String[] args) {
    int i = hammingDistance(1, 4);
    System.out.println(i);

  }
  public static int hammingDistance(int x, int y) {
      int distance = 0;
      for(int xor = x ^ y;xor !=0; xor &=(xor -1)) {
        distance++;
      }
      return distance;
  }
}
