package Project5_Doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {

    private List<Card> allCard = new ArrayList<>();

    public Room(){
        //点数
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","1","2"};
        //花色
        String[] colors = {"A","B","C","D"};

        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card c = new Card(number,color,size);
                allCard.add(c);
            }
        }
        //单独存入大小王
        Card c1 = new Card("","smallking",++size);
        Card c2 = new Card("","bigking",++size);
        Collections.addAll(allCard,c1,c2);
        System.out.println("一副新牌"+allCard);
    }

    public void start() {

        Collections.shuffle(allCard);
        System.out.println("洗牌后" + allCard);

        //发牌
        List<Card> kcy =  new ArrayList<>();
        List<Card> lxy =  new ArrayList<>();
        List<Card> coco =  new ArrayList<>();

        for (int i = 0; i < allCard.size() - 3; i++) {
            Card c = allCard.get(i);
            if(i % 3 == 0){
                kcy.add(c);
            } else if (i % 3 == 1) {
                lxy.add(c);
            }else {
                coco.add(c);
            }

        }

        //对玩家牌进行排序
        sortCards(kcy);
        //看牌
        System.out.println("kcy" + kcy);
        System.out.println("lxy" + lxy);
        System.out.println("coco" + coco);

        //进行截取输出
       List<Card>  lastTreeCard = allCard.subList(allCard.size()-3, allCard.size() );
        System.out.println("底牌是" + lastTreeCard);
        kcy.addAll(lastTreeCard);
        System.out.println("kcy抢到地主后"+kcy);
        sortCards(kcy);
    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getSize() - o2.getSize();//升序排序
            }
        });

    }
}
