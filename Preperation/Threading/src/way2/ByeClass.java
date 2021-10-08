package way2;

public class ByeClass implements Runnable{
    void function() throws InterruptedException {
        while (true){
            System.out.println("Bye");
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