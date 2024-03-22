package Create_Thread;

public class ThreadTest1 {

    public static void main(String[] args) {
        //创建mythread线程类的对象代表一个线程
        Thread t = new MyThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main"+ i);

        }
    }
}
