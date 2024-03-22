package Communication_Thread;

public class ThreadTest {

    public static void main(String[] args) {

        Desk desk = new Desk();
        //三个生产者
        new Thread(()->{
            while (true) {
                try {
                    desk.put();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"厨师1").start();

        new Thread(()->{
            while (true) {
                try {
                    desk.put();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"厨师2").start();

        new Thread(()->{
            while (true) {
                try {
                    desk.put();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"厨师3").start();

        //两个消费者

        new Thread(()->{
            while (true) {
                desk.get();
            }
        },"吃货1").start();

        new Thread(()->{
            while (true) {
                desk.get();
            }
        },"吃货2").start();
    }
}
