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
//    minTree.showGraph(graph);
    minTree.prim(graph, 0);
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

  // prim算法
  public void prim(Graph graph, int v) {
    int visited[] = new int[graph.vertex];

    // 标记节点已访问
    visited[v] = 1;

    int h1 = -1;
    int h2 = -1;

    int minWeight = 10000;
    for (int k = 1; k < graph.vertex; k++) {
      for (int i = 0; i < graph.vertex; i++) {
        for (int j = 0; j < graph.vertex; j++) {
          if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
            minWeight = graph.weight[i][j];
            h1 = i;
            h2 = j;
          }
        }
      }
      System.out.println("边<" + graph.data[h1] + "," + graph.data[h2] + ">" + "权值" + minWeight);
      visited[h2] = 1;
      minWeight = 10000;
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
