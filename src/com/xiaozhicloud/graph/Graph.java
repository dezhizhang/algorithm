package src.com.xiaozhicloud.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


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

    graph.dfs();
  }
}

public class Graph {

  private ArrayList<String> vertexList; // 存储顶点的集合
  private int[][] edges;
  private int numOfEdges; // 表示边的数目
  private boolean[] isVisited;
  public Graph(int n) {
    edges = new int[n][n];
    isVisited = new boolean[n];
    vertexList = new ArrayList<String>(n);
    numOfEdges = 0;
  }
  // 得到第一个领接节点的下标w
  public int getFirstNeighbor(int index) {
    for(int j=0;j < vertexList.size();j++) {
      if(edges[index][j] > 0) {
        return j;
      }
    }
    return  -1;
  }

  // 根据前一个领接节点的下标返回下一个领接节点
  private int getNextNeighbor(int v1,int v2) {
    for(int j=v2 + 1;j < vertexList.size();j++) {
      if(edges[v1][j] > 0) {
        return j;
      }
    }
    return -1;
  }

  // 深度优先遍历算法
  public void dfs(boolean[] isVisited,int i) {
    System.out.print(getValueByIndex(i) + "->");

    // 将节点设置为已经访问
    isVisited[i] = true;

    int w = getFirstNeighbor(i);

    while (w !=-1) {
      if(!isVisited[w]) {
        dfs(isVisited,w);
      }
      w = getNextNeighbor(i,w);
    }
  }

  public void dfs() {
    for(int i=0;i < getNumOfVertex();i++) {
      if(!isVisited[i]) {
        dfs(isVisited,i);
      }
    }
  }

  private void bfs(boolean[] isVisited,int i) {
    int u; //表示队列的头结点对应下标
    int w; //邻接结点

    LinkedList queue = new LinkedList();
    System.out.println(getValueByIndex(i) + "=>");
    isVisited[i] = true;
    queue.addLast(i);
    while (!queue.isEmpty()) {
     u =(Integer)queue.removeFirst();
     w = getFirstNeighbor(u);
     while (w !=-1) {
       if(!isVisited[w]) {
         System.out.println(getValueByIndex(i) + "=>");
         isVisited[w] = true;
         // 入队
         queue.addLast(w);
       }
       w = getNextNeighbor(u,w);
     }
    }
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


