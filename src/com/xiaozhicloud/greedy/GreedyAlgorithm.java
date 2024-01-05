package src.com.xiaozhicloud.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class GreedyAlgorithm {
  public static void main(String[] args) {
    HashMap<String, HashSet<String>> hashMap = new HashMap<String,HashSet<String>>();
    HashSet<String> hashSet1 = new HashSet<String>();
    hashSet1.add("北京");
    hashSet1.add("上海");
    hashSet1.add("天津");


    HashSet<String> hashSet2 = new HashSet<String>();
    hashSet2.add("广州");
    hashSet2.add("北京");
    hashSet2.add("深圳");

    HashSet<String> hashSet3 = new HashSet<String>();
    hashSet3.add("成都");
    hashSet3.add("上海");
    hashSet3.add("杭州");

    HashSet<String> hashSet4 = new HashSet<String>();
    hashSet4.add("成都");
    hashSet4.add("上海");

    HashSet<String> hashSet5 = new HashSet<String>();
    hashSet5.add("杭州");
    hashSet5.add("大连");

    // 加入到hashmap中
    hashMap.put("k1",hashSet1);
    hashMap.put("k2",hashSet2);
    hashMap.put("k3",hashSet3);
    hashMap.put("k4",hashSet4);
    hashMap.put("k5",hashSet5);

    // 存放所有的地区
    HashSet<String> allArea = new HashSet<String>();
    allArea.add("北京");
    allArea.add("上海");
    allArea.add("天津");
    allArea.add("广州");
    allArea.add("深圳");
    allArea.add("成都");
    allArea.add("杭州");
    allArea.add("大连");

    // 创建ArrayList 存放选择的电台集合
    ArrayList<String> selects = new ArrayList<String>();


    HashSet<String> tempSet = new HashSet<String>();

    String maxKey = null;

    while (allArea.size() != 0) {
      maxKey = null;
      for(String key:hashMap.keySet()) {
        tempSet.clear();
        HashSet<String> areas = hashMap.get(key);
        tempSet.addAll(areas);
        tempSet.retainAll(allArea);
        if(tempSet.size() > 0 && (maxKey == null || tempSet.size() > hashMap.get(maxKey).size())) {
            maxKey = key;
        }
      }
      if(maxKey != null) {
        selects.add(maxKey);
        // 将maxKey指向的广播从all集合里清除
        allArea.removeAll(hashMap.get(maxKey));
      }
    }

    System.out.println(selects);

  }


}
