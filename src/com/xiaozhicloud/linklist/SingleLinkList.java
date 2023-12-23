package src.com.xiaozhicloud.linklist;

class SingleLinkListDemo {
  public static void main(String[] args) {
    HeroNode hero1 = new HeroNode(1, "宋江", "及时");
    HeroNode hero2 = new HeroNode(2,"卢俊义","玉諆房");
    HeroNode hero3 = new HeroNode(3,"呈用","智多星");


    HeroNode newHero2 =  new HeroNode(2,"卢俊义1","玉諆房1");

    SingleLinkList singleLinkList = new SingleLinkList();
    singleLinkList.addByOrder(hero1);
    singleLinkList.addByOrder(hero3);
    singleLinkList.addByOrder(hero2);


    singleLinkList.update(newHero2);


    singleLinkList.list();

  }
}

class SingleLinkList{
  private HeroNode head = new HeroNode(0,"","");

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
  public void update(HeroNode newHeroNode) {
    if(head.next == null) {
      System.out.println("链表为空~");
      return;
    }
    HeroNode temp = head.next;
    boolean flag = false;
    while (true) {
      if(temp == null) {
        break; // 已经遍历完链表
      }
      if(temp.no == newHeroNode.no) {
        flag = true;
        break;
      }

      temp = temp.next;

    }

    // 根据flag判断是否找到要修改节点
    if(flag) {
      temp.name = newHeroNode.name;
      temp.nickname = newHeroNode.nickname;
    }

    if(!flag) {
      System.out.printf("没有找到要修改的节点%d",newHeroNode.no);
    }

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
