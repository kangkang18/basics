package Create_Thread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("myrunnable"+ i);

        }
    }
}
