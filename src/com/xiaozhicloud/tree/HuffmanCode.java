package src.com.xiaozhicloud.tree;

import java.util.*;

public class HuffmanCode {
  public static void main(String[] args) {
    String content = "i like like like java do you like a java";
    byte[] contentBytes = content.getBytes();

    List<NodeCode> nodes = getNodes(contentBytes);
    NodeCode huffmanTree = createHuffmanTree(nodes);
    preOrder(huffmanTree);
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
  private static NodeCode createHuffmanTree(List<NodeCode> nodes) {
    while (nodes.size() > 1) {
      Collections.sort(nodes);

      // 取出第一颗最小的二叉树
      NodeCode leftNode = nodes.get(0);
      // 取出第二颗最小的二叉树
      NodeCode rightNode = nodes.get(1);

      NodeCode parent = new NodeCode(null,leftNode.weight + rightNode.weight);

      parent.left = leftNode;
      parent.right = rightNode;

      nodes.remove(leftNode);
      nodes.remove(rightNode);

      // 将新的二叉树加入到nodes
      nodes.add(parent);

    }
    return nodes.get(0);
  }

  // 前序遍历方法
  private static void preOrder(NodeCode root) {
    if(root == null) {
      System.out.println("树为空");
      return;
    }
    root.preOrder();
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
  public void preOrder() {
    System.out.println(this);
    if(this.left != null) {
      this.left.preOrder();
    }
    if(this.right != null) {
      this.right.preOrder();
    }
  }
}
