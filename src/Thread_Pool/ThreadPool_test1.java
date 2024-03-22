package Thread_Pool;

import java.util.concurrent.*;

public class ThreadPool_test1 {
    public static void main(String[] args) {
//        new ThreadPoolExecutor(int corePoolSize,
//        int maximumPoolSize,
//        long keepAliveTime,
//        TimeUnit unit,
//        BlockingQueue<Runnable> workQueue,
//        ThreadFactory threadFactory,
//        RejectedExecutionHandler handler)
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);//复用前面线程
        pool.execute(target);//复用前面线程

        pool.shutdown();//等任务执行完毕关闭
//        pool.shutdownNow();//立即关闭
    }


}
