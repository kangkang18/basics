package StreamTest;

import java.util.*;
import java.util.stream.Stream;

public class Stream_test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //获取stream流
        Stream<String> stream = names.stream();

        Collections.addAll(names, "kcy", "kk", "coco", "lxy");


        Set<String> set = new HashSet<>();
        Collections.addAll(set, "kcy", "kk", "coco", "lxy");

        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("k")).forEach(s -> System.out.println(s));

        Map<String, Double> map = new HashMap<>();
        map.put("kk", 22.0);
        map.put("csl", 23.0);
        map.put("zwx", 23.0);
        map.put("wj", 25.0);

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Set<String> set2 = map.keySet();
        Collection<Double> set3 = map.values();
        System.out.println("$$$$$$$$$");
        set2.stream().filter(s -> s.contains("k")).sorted().forEach(s -> System.out.println(s));
        set3.stream().filter(s -> s >= 20).sorted().forEach(s-> System.out.println(s));


        //获取数组的stream流
        String[] names2 = {"kcy", "kk", "coco", "lxy"};
        Stream<String> s1 = Arrays.stream(names2);
        Stream<String> s2 = Stream.of(names2);


    }
}
