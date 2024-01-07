package src.com.xiaozhicloud.horse;

import java.awt.*;
import java.nio.channels.Pipe;
import java.util.ArrayList;

public class Horse {
  public static void main(String[] args) {

  }
  public static ArrayList<Point> next(Point curPoint) {
    ArrayList<Point> ps = new ArrayList<Point>();

    // 创建一个point
    Point p1 = new Point();
    if((p1.x = curPoint.x -2) >=0 && (p1.y = curPoint.y -1) > 0) {
      ps.add(new Point(p1));
    }
    // 判断

     return ps;
  }
}
