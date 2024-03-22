package Create_Thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        //把任务对象交给线程对象
        new Thread(target).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("thread"+ i);

        }
    }
}
