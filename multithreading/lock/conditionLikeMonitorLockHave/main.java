package multithreading.lock.conditionLikeMonitorLockHave;

public class main {
    public static void main(String[] args) {

        sharedResources resources = new sharedResources();
        Thread th1 = new Thread(()->{
            for (int i = 0; i < 2; i++) {
                resources.producer();
            }
        });

        Thread th2 = new Thread(()->{
            for (int i = 0; i < 2; i++) {
                resources.consume();
            }
        });

        th1.start();
        th2.start();
    }
}
