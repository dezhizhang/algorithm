package src.com.xiaozhicloud.horse;

import java.awt.*;
import java.nio.channels.Pipe;
import java.util.ArrayList;

public class Horse {
  private static int X; // 棋盘的列数
  private static int Y; // 棋盘的行数

  public static void main(String[] args) {

  }

  public static ArrayList<Point> next(Point curPoint) {
    ArrayList<Point> ps = new ArrayList<Point>();

    // 创建一个point
    Point p1 = new Point();
    if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y - 1) >= 0) {
      ps.add(new Point(p1));
    }
    // 判断马儿可以走6位置
    if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y - 2) >= 0) {
      ps.add(new Point(p1));
    }
    // 判断马儿可以走7位置
    if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y - 2) >= 0) {
      ps.add(new Point(p1));
    }
    // 判断马儿可以走0位置
    if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y - 1) >= 0) {
      ps.add(new Point(p1));
    }

    // 判断马儿可以走1位置
    if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y + 1) < Y) {
      ps.add(new Point(p1));
    }

    // 判断马儿可以走2位置
    if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y + 2) < Y) {
      ps.add(new Point(p1));
    }
    // 判断马儿可以走3位置
    if ((p1.x = curPoint.x - 1) >=0 && (p1.y = curPoint.y + 2) < Y) {
      ps.add(new Point(p1));
    }
    // 判断马儿可以走4位置
    if ((p1.x = curPoint.x - 2) >=0 && (p1.y = curPoint.y + 1) < Y) {
      ps.add(new Point(p1));
    }


    return ps;
  }
}
