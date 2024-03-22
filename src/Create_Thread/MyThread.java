package Create_Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        //描述线程任务
        for (int i = 0; i < 5; i++) {
            System.out.println("mythread"+ i);

        }
    }
}
