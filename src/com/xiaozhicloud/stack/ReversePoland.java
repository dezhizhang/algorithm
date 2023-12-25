package src.com.xiaozhicloud.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReversePoland {
  public static void main(String[] args) {
    String suffixExpression = "3 4 + 5 * 6 - ";
    List<String> rpnList = getListString(suffixExpression);
    int calculate = calculate(rpnList);
    System.out.println(calculate);
  }

  public static List<String> getListString(String suffixExpression) {
    String[] split = suffixExpression.split(" ");
    List<String> list = new ArrayList<String>();
    for (String ele : split) {
      list.add(ele);
    }
    return list;
  }

  public static int calculate(List<String> list) {
    Stack<String> stack = new Stack<String>();
    for (String item : list) {
      if (item.matches("\\d+")) {
        stack.push(item);
      }else {
        // 如果是符号pop两个数并运算再入栈
        int num2 = Integer.parseInt(stack.pop());
        int num1 = Integer.parseInt(stack.pop());

        int result = 0;
        if(item.equals("+")) {
          result = num1 + num2;
        }else if(item.equals("-")) {
          result = num1 - num2;
        }else if(item.equals("*")) {
          result = num1 * num2;
        }else if(item.equals("/")) {
          result = num1 / num2;
        }else {
          throw  new RuntimeException(" 运算符有误");
        }
        stack.push(Integer.toString(result));
      }
    }
    return Integer.parseInt(stack.pop());
  }
}
