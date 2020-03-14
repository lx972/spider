import java.util.concurrent.CountDownLatch;

/**
 * PACKAGE_NAME
 *
 * @Author Administrator
 * @date 14:07
 */
public class InterruptRunnable implements Runnable {
    private CountDownLatch beginLatch;
    private ConcurrentTaskExecutor concurrentTaskExecutor;

    public InterruptRunnable(ConcurrentTaskExecutor currConcurrentTaskExecutor, CountDownLatch beginLatch) {
        this.beginLatch = beginLatch;
        this.concurrentTaskExecutor = currConcurrentTaskExecutor;
    }

    @Override
    public void run() {
        try {
            beginLatch.await();
            long millis = (long) (Math.random() * 10 * 1000);
            System.out.println(String.format("System need sleep %s millis", millis));
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        concurrentTaskExecutor.setCanceled(true);
    }
}
