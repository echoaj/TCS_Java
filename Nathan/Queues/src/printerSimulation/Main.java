package printerSimulation;

import package1.Queue;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        int np = 10; // number of people
        Queue<Person> q = new Queue<>();
        Thread enqueue = new Thread(new StartPrint(q, np));
        Thread dequeue = new Thread(new EndPrint(q, np));

        enqueue.start();
        Thread.sleep(500);
        dequeue.start();

        enqueue.join();
        dequeue.join();

        System.out.println("Done");


    }
}
