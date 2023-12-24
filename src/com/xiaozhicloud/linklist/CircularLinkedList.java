package src.com.xiaozhicloud.linklist;

class CircularLinkedListTest {
  public static void main(String[] args) {

  }
}

public class  CircularLinkedList{
  private Boy first = new Boy(-1,"小明");

  public void addBoy(int nums) {
    if(nums < 1) {
      System.out.println("nums值不正确");
      return;
    }

    Boy curBoy = null;
    for(int i=1;i <=nums;i++) {
      Boy boy = new Boy(i,"小明" + i);
      if(i==1) {
        first = boy;
        first.setNext(first);
        curBoy = first;
      }else {
        curBoy.setNext(boy);
      }


    }

  }
}

class Boy {
  private int no; // 编号
  private  String name; // 名称
  private Boy next; // 指向下一个节点

  public Boy(int no,String name) {
    this.no = no;
    this.name = name;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getNo() {
    return no;
  }

  public void setNext(Boy next) {
    this.next = next;
  }

  public Boy getNext() {
    return next;
  }

  public String getName() {
    return name;
  }
}



