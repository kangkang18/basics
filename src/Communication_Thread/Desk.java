package Communication_Thread;

import java.util.ArrayList;
import java.util.List;

public class Desk {
    private List<String> list = new ArrayList<>();


    //三个生产者进行竞争
    public synchronized void put() throws InterruptedException {
        try {
            String name = Thread.currentThread().getName();

            if (list.size() == 0){
                list.add(name + "做的肉包子");
                System.out.println(name + "做了一个肉包子~~");
                Thread.sleep(2000);

                //唤醒别人，等待自己，
                this.notify();
                this.wait();
            }else{
                //有包子了 ，唤醒别人，等待自己
                this.notify();
                this.wait();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    //两个消费者进行竞争
    public synchronized void get() {
        try {
            String name = Thread.currentThread().getName();
            if (list.size() == 1){
                System.out.println(name + "吃了："+ list.get(0));
                list.clear();
                Thread.sleep(1000);
                this.notify();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
