package multithreading.exampleOfMultiThreadingQueueMethod;

public class main {
    public static void main(String[] args) {
        sharedData sd = new sharedData(3);

        System.out.println("main method starts here");

    Thread produceThread = new Thread(() -> {
        try {
            for(int i=1; i<= 6;i++){
                sd.produce(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    });

    Thread consumeThread = new Thread(() -> {
        try {
            for(int i=1; i<= 6; i++){
                sd.consume();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    });

//    deprecate version;
//    produceThread.stop();
//    produceThread.resume();

    //set priority
    produceThread.setPriority(Thread.NORM_PRIORITY);
    consumeThread.setPriority(Thread.MAX_PRIORITY);

    //set Daemon - is a kind of Async based like when main thread is waiting for produceThread(join method) then its fine becuase of
        // produce thread once complete then back to main then main thread also end here
        // but when main method is not wait for produce thread then current produce thread will end here same time of main
        produceThread.setDaemon(true);

    produceThread.start();
    consumeThread.start();

    try{
        //join using for hold a main method end initial , main will end on when  produceThread.join(), consumeThread.join(); end then only main end
        System.out.println("main thread is waiting for complete both  producer and consument end");
        produceThread.join();
        consumeThread.join();
    }catch (Exception e){

    }

        System.out.println("main method ended here");
    }
}
