package Thread_Pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        //描述线程的任务和返回结果
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += i;
        }
        return Thread.currentThread().getName()+"求出1daon的和是" + sum;
    }
}
