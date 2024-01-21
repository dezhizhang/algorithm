package src.com.leetcode.findNumbers;

public class FindNumbers {
  public static void main(String[] args) {
    int[] arr = {12,345,2,6,7896};
    int numbers = findNumbers(arr);
    System.out.println(numbers);

  }
  public static int findNumbers(int[] nums) {
    int ant = 0;
    for(int i=0;i < nums.length;i++) {
      if(String.valueOf(nums[i]).length() % 2 == 0) {
        ant++;
      }
    }
    return ant;
  }
}
