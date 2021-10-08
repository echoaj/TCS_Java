package way1;

public class ByeThread extends Thread{
    void function() throws InterruptedException {
        while (true){
            System.out.println("Bye World");
            sleep(1000);
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
