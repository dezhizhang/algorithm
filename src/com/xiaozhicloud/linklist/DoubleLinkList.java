package src.com.xiaozhicloud.linklist;

class DoubleLinkListTest {
  public static void main(String[] args) {
    HeroNode2 heroNode2 = new HeroNode2(1, "宋江", "及时丽");
    HeroNode2 heroNode21 = new HeroNode2(2, "卢俊义", "玉妄谈");
    HeroNode2 heroNode22 = new HeroNode2(3, "吴用", "智多星");

    DoubleLinkList doubleLinkList = new DoubleLinkList();
    doubleLinkList.add(heroNode2);
    doubleLinkList.add(heroNode21);
    doubleLinkList.add(heroNode22);

    doubleLinkList.list();


    System.out.println("---------------");

    HeroNode2 heroNode23 = new HeroNode2(2, "公孙胜", "入云龙");
    doubleLinkList.update(heroNode23);

    doubleLinkList.delete(2);

    doubleLinkList.list();

  }
}

class DoubleLinkList {
  private HeroNode2 head = new HeroNode2(0, "", "");

  // 获取链表的头节点
  public HeroNode2 getHead() {
    return head;
  }

  // 添加节点
  public void add(HeroNode2 heroNode2) {
    HeroNode2 temp = head;
    while (true) {
      if (temp.next == null) {
        break;
      }
      temp = temp.next;
    }
    temp.next = heroNode2;
    heroNode2.prev = temp;
  }

  // 双向链表修改
  public void update(HeroNode2 newHeroNode2) {
    if (head.next == null) {
      System.out.println("链表为空");
      return;
    }
    HeroNode2 temp = head.next;
    boolean flag = false;
    while (true) {
      if (temp == null) {
        break;
      }
      if (temp.no == newHeroNode2.no) {
        flag = true;
        break;
      }
      temp = temp.next;
    }
    if (flag) {
      temp.name = newHeroNode2.name;
      temp.nickname = newHeroNode2.nickname;
      return;
    }
    System.out.printf("没有找到%d的节点", newHeroNode2.no);
  }

  public void delete(int no) {
    if (head.next == null) {
      System.out.println("链表为空，不能删除");
      return;
    }

    HeroNode2 temp = head.next;
    boolean flag = false;
    while (true) {
      if (temp == null) {
        break;
      }
      if (temp.no == no) {
        flag = true;
        break;
      }
      temp = temp.next;
    }
    if (flag) {
      temp.prev.next = temp.next;
      if (temp.next != null) {
        temp.next.prev = temp.prev;
      }
      return;
    }
    System.out.printf("要删除的节点不存在%d", no);

  }


  // 遍历双向链表
  public void list() {
    if (head.next == null) {
      System.out.println("链表为空");
      return;
    }
    HeroNode2 temp = head.next;
    while (true) {
      if (temp == null) {
        break;
      }
      System.out.println(temp);
      temp = temp.next;
    }
  }
}


class HeroNode2 {
  public int no;
  public String name;
  public String nickname;
  public HeroNode2 next;
  public HeroNode2 prev; // 指向前一个位置的节点

  public HeroNode2(int no, String name, String nickname) {
    this.no = no;
    this.name = name;
    this.nickname = nickname;
  }

  @Override
  public String toString() {
    return "HeroNode{" + "no=" + no + ", name='" + name + '\'' + ", nickname='" + nickname + '}';
  }
}
