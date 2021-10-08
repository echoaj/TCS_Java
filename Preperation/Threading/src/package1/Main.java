package package1;


import way1.HelloThread;
import way1.ByeThread;
import way2.HelloClass;
import way2.ByeClass;

public class Main{

    public static void main(String[] args) throws InterruptedException {

        /* WAY 1 */
//        HelloThread t1 = new HelloThread();
//        ByeThread t2 = new ByeThread();
//
//        t1.start();
//        Thread.sleep(500);
//        t2.start();
//
//        t1.join();
//        t2.join();

        /* Way 2 */
        Thread t3 = new Thread(new HelloClass());
        Thread t4 = new Thread(new ByeClass());

        t3.start();
        Thread.sleep(500);
        t4.start();

        t3.join();
        t4.join();

        System.out.println("done");
    }
}
