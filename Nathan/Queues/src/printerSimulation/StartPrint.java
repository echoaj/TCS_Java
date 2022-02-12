package printerSimulation;

import package1.Queue;
import java.util.Random;


public class StartPrint implements Runnable{
    Random rand = new Random();
    Queue<Person> queue;
    int numberOfPeople;
    static float waitTime = 0;
    int id = 1;

    StartPrint(Queue<Person> q, int nop){
        queue = q;
        numberOfPeople = nop;
    }

    public void function() throws InterruptedException {
        for (int i = 0; i < numberOfPeople; i++) {
            // create new person object
            Person p = new Person(id);
            waitTime += p.print_time;
            p.total_wait = waitTime;
            p.status();
            // push it on queue
            queue.push(p);
            int min = 750;
            int max = 1500;
            int seconds = rand.nextInt(max - min + 1) + min;
            Thread.sleep(seconds);
            id += 1;
        }
    }

    @Override
    public void run() {
        try {
            function();
        } catch (InterruptedException e) {
            System.out.println("Thread Error");
            e.printStackTrace();
        }
    }
}
