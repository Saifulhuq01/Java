package multithreading.exampleOfMultiThreadingQueueMethod;

public class main {
    public static void main(String[] args) {
        sharedData sd = new sharedData(3);

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

    produceThread.start();
    consumeThread.start();
    }
}
