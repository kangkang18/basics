package Map_test;

import java.util.*;

public class Map_test1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("kcy", 22);
        map.put("csl", 23);
        map.put("zwx", 23);
        System.out.println(map);

        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("kcy", 22);
        map1.put("csl", 23);
        map1.put("zwx", 23);
        System.out.println(map1);


        System.out.println(map.size());
        System.out.println(map.get("kcy"));
        map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());

        System.out.println(map.containsKey("csl"));

        Set<String> keys = map1.keySet();
        System.out.println(keys);

        //获取map集合的全部的值
        Collection<Integer> values = map1.values();
        System.out.println("全部值为：" + values);

        //通过键值对进行遍历

        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key1 = entry.getKey();
            Integer values1 = entry.getValue();
            System.out.println("键：" + key1 + " 值：" + values1);


        }

        map1.forEach((k, v) -> {
            System.out.println(k + "----->" + v);
        });


    }
}
