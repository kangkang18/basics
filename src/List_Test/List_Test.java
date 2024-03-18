package List_Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Test {
    public static void main(String[] args){
        List<String> name = new ArrayList<>(); //经常会用到的格式

        String name1 = "kcy";
        String name2 = "csl";
        String name3 = "zwx";
        String name4 = "wj";

        name.add(name1);
        name.add(name2);
        name.add(name3);
        name.add(name4);

        System.out.println(name);

        name.set(0,"lxy");

        System.out.println(name);

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }

        Iterator<String> iterator = name.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String s: name){
            System.out.println(s);
        }

        name.forEach(s->{
            System.out.println(s);
        });

    }

}
