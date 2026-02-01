package multithreading.exampleOfMultiThreading;

public class consumer implements Runnable {
    sharedResources sr;
    consumer(sharedResources sr){
        this.sr = sr;
    }
    public void run(){
        System.out.println("Consumer thread started: " + Thread.currentThread().getName());
        sr.consumeItem();
    }
}
