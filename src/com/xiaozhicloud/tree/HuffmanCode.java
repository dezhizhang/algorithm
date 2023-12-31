package src.com.xiaozhicloud.tree;

import java.util.*;

public class HuffmanCode {
  public static void main(String[] args) {
    String content = "i like like like java do you like a java";
    byte[] contentBytes = content.getBytes();

    List<NodeCode> nodes = getNodes(contentBytes);
    System.out.println(nodes);
  }

  public static List<NodeCode> getNodes(byte[] bytes) {
    ArrayList<NodeCode> nodes = new ArrayList<NodeCode>();

    Map<Byte,Integer> counts = new HashMap<>();

    for(byte b:bytes) {
      Integer count = counts.get(b);
      if(count == null) {
        counts.put(b,1);
      }else {
        counts.put(b,count + 1);
      }
    }

    for(Map.Entry<Byte,Integer> entry:counts.entrySet()) {
      nodes.add(new NodeCode(entry.getKey(),entry.getValue()));
    }
    return nodes;
  }

  // 通过list创建对应的赫夫曼树
  private static Node createHuffmanTree(List<NodeCode> nodes) {

  }

}


class NodeCode implements Comparable<NodeCode> {
  Byte data;
  int weight;
  NodeCode left;
  NodeCode right;

  public NodeCode(Byte data, int weight) {
    this.data = data;
    this.weight = weight;
  }

  @Override
  public int compareTo(NodeCode o) {
    return this.weight - o.weight;
  }

  @Override
  public String toString() {
    return "Node[data=" + data + "weight=" + weight + "]";
  }
  // 前序遍历
}
