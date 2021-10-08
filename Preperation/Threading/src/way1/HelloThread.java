package way1;


// WAY 1
public class HelloThread extends Thread {
    public void function() throws InterruptedException {
        while(true){
            System.out.println("Hello World");
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
