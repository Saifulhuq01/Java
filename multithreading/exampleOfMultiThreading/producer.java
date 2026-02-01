package multithreading.exampleOfMultiThreading;

public class producer implements Runnable {
    
    sharedResources sr;
    
    public producer(sharedResources sr) {
        this.sr = sr;
    }
    public void run() {
        System.out.println("Producer thread started: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sr.addItem();
    }
}
