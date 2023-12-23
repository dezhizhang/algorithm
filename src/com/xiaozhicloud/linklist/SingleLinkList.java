package src.com.xiaozhicloud.linklist;

import java.util.Stack;

class SingleLinkListDemo {
  public static void main(String[] args) {
    HeroNode hero1 = new HeroNode(1, "宋江", "及时");
    HeroNode hero2 = new HeroNode(2,"卢俊义","玉諆房");
    HeroNode hero3 = new HeroNode(3,"吴用","智多星");


    HeroNode newHero2 =  new HeroNode(2,"卢俊义1","玉諆房1");

    SingleLinkList singleLinkList = new SingleLinkList();
    singleLinkList.addByOrder(hero1);
    singleLinkList.addByOrder(hero3);
    singleLinkList.addByOrder(hero2);


    SingleLinkList.reversePrint(singleLinkList.getHead());



  }
}

class SingleLinkList{
  private HeroNode head = new HeroNode(0,"","");

  public HeroNode getHead() {
    return head;
  }

  public void add(HeroNode heroNode) {
    HeroNode temp = head;
    while (true) {
      if(temp.next == null) {
        break;
      }
      temp = temp.next;
    }
    temp.next = heroNode;
  }
  // 按顺序加入节点
  public void  addByOrder(HeroNode heroNode) {
    HeroNode temp = head;
    boolean flag = false;

    while (true) {
      if(temp.next == null) {
        break;
      }
      if(temp.next.no > heroNode.no) {
        break;
      }
      if(temp.next.no == heroNode.no) {
        flag = true;
        break;
      }
      temp = temp.next;
    }

    if(flag) {
      System.out.printf("准备插入的英雄的编号%d 已存在不能添加",heroNode.no);
      System.out.println();
      return;
    }

    heroNode.next = temp.next;
    temp.next = heroNode;

  }

  // 修改链表
  public  void update(HeroNode newHeroNode) {
    if(head.next == null) {
      System.out.println("链表为空~");
      return;
    }
    HeroNode temp = head.next;
    boolean flag = false;
    while (true) {
      if(temp == null) {
        break;
      }
      if(temp.no == newHeroNode.no) {
        flag = true;
        break;
      }
      temp = temp.next;
    }
    if(flag) {
      temp.name = newHeroNode.name;
      temp.nickname = newHeroNode.nickname;
    }
    if(!flag) {
      System.out.printf("没有找到要修改的节点%d",newHeroNode.no);
      System.out.println();
    }
  }

  public void  delete(int no) {
    HeroNode temp = head;
    boolean flag = false; // 标志是否找到待删除节点
    while (true) {
      if(temp.next == null) {
        break;
      }
      if(temp.next.no == no) {
          flag = true;
          break;
      }
      temp = temp.next;

    }
    temp.next.next = temp.next;
  }

  // 统计链表有效个数
  public static int getLength(HeroNode head) {
    if(head.next == null) {
      return  0;
    }
    int length = 0;
    HeroNode cur = head.next;
    while (cur != null) {
      length++;
      cur = cur.next;
    }
    return  length;
  }

  // 查看单链表中的倒数第k个节点
  public static HeroNode findLastIndexNode(HeroNode head,int index) {
    if(head.next == null) {
      return null;
    }

    int size = getLength(head);

    if(index <=0 || index > size) {
      return null;
    }

    HeroNode cur = head.next;
    for(int i=0;i < size - index;i++) {
      cur = cur.next;
    }
    return  cur;

  }

  // 单链表反转
  public static void reverseList(HeroNode head) {
      if(head.next == null || head.next.next == null) {
        return;
      }
      HeroNode cur = head.next;
      HeroNode next = null;
      HeroNode reverseHead = new HeroNode(0,"","");

      while (cur != null) {
        next = cur.next;
        cur.next = reverseHead.next;
        reverseHead.next = cur;
        cur = next;
      }

      head.next = reverseHead.next;
  }


  // 显示链表
  public void list() {
    if(head.next == null) {
      System.out.println("链表为空");
      return;
    }
    HeroNode temp = head.next;
    while (true) {
      if(temp == null) {
        break;
      }
      System.out.println(temp);
      temp = temp.next;
    }
  }

  // 单链表的逆序打印
  public static void reversePrint(HeroNode head) {
    if(head.next == null) {
      return;
    }
    Stack<HeroNode> stack = new Stack<HeroNode>();
     HeroNode cur = head.next;
     while (cur != null) {
       stack.push(cur);
       cur = cur.next;
     }

     while (stack.size() > 0) {
       System.out.println(stack.pop());
     }

  }

}


class HeroNode {
  public int no;
  public String name;
  public String nickname;
  public HeroNode next;

  public HeroNode(int no, String name,String nickname) {
    this.no = no;
    this.name = name;
    this.nickname = nickname;
  }

  @Override
  public String toString() {
    return "HeroNode{" +
      "no=" + no +
      ", name='" + name + '\'' +
      ", nickname='" + nickname +
      '}';
  }
}
