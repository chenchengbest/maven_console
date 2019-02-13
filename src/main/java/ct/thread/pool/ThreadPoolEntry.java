package ct.thread.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * The type Thread pool entry.
 *
 * @author chen.cheng
 */
public class ThreadPoolEntry {
    /**
     * The constant produceTaskSleepTime.
     */
    private static int produceTaskSleepTime = 5;
    /**
     * The constant produceTaskMaxNumber.
     */
    private static int produceTaskMaxNumber = 20;

    private static ThreadPoolExecutor threadPool;

    static {
        //构造一个线程池
        threadPool = new ThreadPoolExecutor(2, 4, 30000,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(20),
                new ThreadPoolExecutor.DiscardPolicy());
    }

    /**
     * Gets thread pool.
     */
    public static void getThreadPool() {
        for (int i = 1; i <= produceTaskMaxNumber; i++) {
            try {
                //一个任务，并将其加入到线程池
                String work = "work@ " + i;
                System.out.println("put ：" + work);
                threadPool.execute(new ThreadPoolTask(work));
                //便于观察，等待一段时间
                Thread.sleep(produceTaskSleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
