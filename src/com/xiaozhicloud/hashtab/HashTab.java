package src.com.xiaozhicloud.hashtab;


import java.util.Scanner;

class HashTabDemo{
  public static void main(String[] args) {
    // 创建哈希表
    HashTab hashTab = new HashTab(7);

    // 写一个菜单
    String key = "";
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("add: 添加雇员");
      System.out.println("list: 显示雇员");
      System.out.println("find: 查找雇员");
      System.out.println("exit: 退出系统");

      key = scanner.next();
      switch (key) {
        case "add":
          System.out.println("输入id");
          int id = scanner.nextInt();
          System.out.println("输入名字");
          String name = scanner.next();
          Emp emp = new Emp(id,name);
          hashTab.add(emp);
          break;
        case "list":
          hashTab.list();
          break;
        case "find":
          System.out.println("请便入要查找的id");
          id = scanner.nextInt();
          hashTab.findEmpById(id);
          break;
        case "exit":
          scanner.close();
          System.exit(0);
        default:
          break;
      }
    }
  }
}


public class HashTab {
    private EmpLinkedList[] empLinkedLists;
    private int size;
    public HashTab(int size) {
      this.size = size;
      empLinkedLists = new EmpLinkedList[size];
      // 分别初始化每一条链表
      for(int i=0;i < size;i++) {
        empLinkedLists[i] = new EmpLinkedList();
      }
    }
    // 添加雇员
    public void add(Emp emp) {
      int empLinkedListsNo = hashFun(emp.id);
      empLinkedLists[empLinkedListsNo].add(emp);

    }

    // 遍历所有链表
    public void list() {
      for(int i=0;i < size;i++) {
        empLinkedLists[i].list(i + 1);
      }
    }
    // 根据输入id查找雇员
    public void findEmpById(int id) {
      int empLinkedListsNo = hashFun(id);
      Emp emp = empLinkedLists[empLinkedListsNo].findEmpById(id);
      if(emp == null) {
        return;
      }
      System.out.printf("在第%d条锭表中找到该雇员id=%d",empLinkedListsNo,id);
      System.out.println();
    }
    // 散列函数
    public int hashFun(int id) {
      return  id % size;
    }
}

class Emp {
  public int id;
  public String name;
  public Emp next;

  public Emp(int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

}

class EmpLinkedList {
  private Emp head;
  // 添加节点
  public void add(Emp emp) {
    // 如果是添加第一个雇员
    if (head == null) {
      head = emp;
      return;
    }

    Emp curEmp = head;
    while (true) {
      if(curEmp.next == null) {
        break;
      }
      curEmp = curEmp.next;
    }

    curEmp.next = emp;
  }
  public void list(int no) {
    if(head == null) {
      System.out.println("链表"+no+"为空");
      return;
    }
    System.out.print("第" + no + "链表的信息为");
    Emp curEmp = head;
    while (true) {
      System.out.printf("=>id=%d name=%s\t",curEmp.id,curEmp.name);
      if(curEmp.next == null) {
        break;
      }
      curEmp = curEmp.next;
    }
    System.out.println();
  }
  // 根据id查找雇员
  public Emp findEmpById(int id) {
    // 判断链表是否为空
    if(head == null) {
      System.out.println("链表为空");
      return null;
    }

    Emp curEmp = head;
    while (true) {
      if(curEmp.id == id) {
        break;
      }
      if(curEmp.next == null) {
        curEmp = null;
        break;
      }
      curEmp = curEmp.next;
    }
    return curEmp;
  }


}


