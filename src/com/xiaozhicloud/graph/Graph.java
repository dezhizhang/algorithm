package src.com.xiaozhicloud.graph;

import java.util.ArrayList;
import java.util.Arrays;


class GraphTest{
  public static void main(String[] args) {
    int n = 5;
    String vertex[] = {"A","B","C","D","E"};
    Graph graph = new Graph(n);
    for(String value:vertex) {
      graph.insertVertex(value);
    }

    graph.insertEdge(0,1,1);
    graph.insertEdge(0,2,1);
    graph.insertEdge(1,2,1);
    graph.insertEdge(1,3,1);
    graph.insertEdge(1,4,1);
    graph.showGraph();
  }
}

public class Graph {

  private ArrayList<String> vertexList; // 存储顶点的集合
  private int[][] edges;
  private int numOfEdges; // 表示边的数目
  public Graph(int n) {
    edges = new int[n][n];
    vertexList = new ArrayList<String>(n);
    numOfEdges = 0;
  }

  // 插入顶点
  public void insertVertex(String vertex) {
    vertexList.add(vertex);
  }

  // 添加这
  public void insertEdge(int v1,int v2,int weight) {
    edges[v1][v2] = weight;
    edges[v2][v1] = weight;
    numOfEdges++;
  }

  // 返回节点的个数
  public int getNumOfVertex() {
    return vertexList.size();
  }

  // 返回边的数目
  public int getNumOfEdges() {
    return  numOfEdges;
  }

  // 返回i对应的下标值
  public String getValueByIndex(int i) {
    return  vertexList.get(i);
  }

  // 返回v1和v2的权值
  public int getWeight(int v1,int v2) {
    return edges[v1][v2];
  }

  // 显示节点的个数
  public void showGraph() {
    for(int[] link:edges) {
      System.out.println(Arrays.toString(link));
    }
  }

}


