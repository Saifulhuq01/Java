package multithreading.exampleOfMultiThreading;

public class sharedResources {
    boolean available = false;

    public synchronized void addItem(){
        available = true;
        System.out.println("Item added"+ Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){

        while (!available) {
            try{
                System.out.println("Thread waiting: " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Item consumed by " + Thread.currentThread().getName());
        available = false;
    }
}
