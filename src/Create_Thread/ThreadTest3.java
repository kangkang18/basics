package Create_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> myCallable = new MyCallable(10);
        //未来任务对象，实现Runnable接口，可以交给线程处理
        FutureTask<String> stringFutureTask = new FutureTask<>(myCallable);

        new Thread(stringFutureTask).start();

        // 获取线程执行完毕的结果

        //如果上面的任务没有执行完，这里会等到执行完，才获取结果
        String s = stringFutureTask.get();
        System.out.println(s);
    }
}
