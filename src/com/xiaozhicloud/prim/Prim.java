package src.com.xiaozhicloud.prim;

import java.util.Arrays;

public class Prim {
  public static void main(String[] args) {
    int max = 10000;
    char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};

    int vertex = data.length;
    int[][] weight = new int[][]{
      {max, 5, 7, max, max, max, 2},
      {5, max, max, 9, max, max, 3},
      {7, max, max, max, 8, max, max},
      {max, 9, max, max, max, 4, max},
      {max, max, 8, max, max, 5, 4},
      {max, max, max, 4, 5, max, 6},
      {2, 3, max, max, 4, 6, max},
    };
    // 创建graph对像
    Graph graph = new Graph(vertex);
    MinTree minTree = new MinTree();
    minTree.createGraph(graph, vertex, data, weight);
    minTree.showGraph(graph);
  }
}


// 创建最小生成树

class MinTree {
  public void createGraph(Graph graph, int vertex, char data[], int[][] weight) {
    int i, j;
    for (i = 0; i < vertex; i++) {
      graph.data[i] = data[i];
      for (j = 0; j < vertex; j++) {
        graph.weight[i][j] = weight[i][j];
      }
    }
  }

  // 显示图的方法
  public void showGraph(Graph graph) {
    for (int[] link : graph.weight) {
      System.out.println(Arrays.toString(link));
    }
  }

}

class Graph {
  int vertex; // 表示图的节点个数
  char[] data; // 存放节点数据
  int[][] weight; // 存放边

  public Graph(int vertex) {
    this.vertex = vertex;
    this.data = new char[vertex];
    this.weight = new int[vertex][vertex];
  }
}
