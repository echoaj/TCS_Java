package way2;

public class HelloClass implements Runnable{

    public void function() throws InterruptedException {
        while(true){
            System.out.println("Hello");
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        try{
            function();
        }catch (Exception e){
            System.out.println("Thread Error");
        }
    }
}
