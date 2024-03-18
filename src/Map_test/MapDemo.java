package Map_test;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();

        String[] selects = {"A","B","C","D"};

        //生成一个随机数
        Random r = new Random();

        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4);
            data.add(selects[index]);
        }

        //统计每个景点的投票人数
        Map<String,Integer> result = new HashMap<>();

        for (String s : data) {
            if(result.containsKey(s)){
                //说明统计过  值加1
                result.put(s, result.get(s)+1);

            }else{
                //第一次统计
                result.put(s,1);
            }
        }

        System.out.println(result);
    }
}
