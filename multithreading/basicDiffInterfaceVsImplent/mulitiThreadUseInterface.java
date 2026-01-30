package multithreading.basicDiffInterfaceVsImplent;

public class mulitiThreadUseInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("code executed inside of interface method: "+ Thread.currentThread().getName());
    }
}
