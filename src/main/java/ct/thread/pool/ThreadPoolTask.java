package ct.thread.pool;

/**
 * The type Thread pool task.
 *
 * @author chen.cheng
 */
public class ThreadPoolTask implements Runnable {
    /**
     * The constant serialVersionUID.
     */
    private static final long serialVersionUID = 0;
    /**
     * The Thread pool task data.
     */
    private Object threadPoolTaskData;


    /**
     * The constant consumeTaskSleepTime.
     */
    private static int consumeTaskSleepTime = 50;

    /**
     * Instantiates a new Thread pool task.
     *
     * @param works the works
     */
    ThreadPoolTask(Object works) {
        this.threadPoolTaskData = works;
    }

    /**
     * Run.
     */
    @Override
    public void run() {
        //处理一个任务，这里的处理方式太简单了，仅仅是一个打印语句
        System.out.println("start------" + threadPoolTaskData);
        try {
            //便于观察，等待一段时间
            Thread.sleep(consumeTaskSleepTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Get task object.
     *
     * @return the object
     */
    public Object getTask() {
        return this.threadPoolTaskData;
    }
}
