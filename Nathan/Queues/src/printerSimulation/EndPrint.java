package printerSimulation;

import package1.Queue;

public class EndPrint implements Runnable{
    Queue<Person> queue;
    int numberOfPeople;

    EndPrint(Queue<Person> q, int nop){
        queue = q;
        numberOfPeople = nop;
    }

    public void function() throws InterruptedException {
        for (int i = 0; i < numberOfPeople; i++) {
            // Check if queue is empty
            if (queue.length() > 0) {
                // Peek
                Person p = queue.peek();
                // wait for amount of time
                Thread.sleep((long) (p.print_time * 1000));
                // pop person off
                queue.pop();
                p.finish();
                StartPrint.waitTime -= p.print_time;
            }
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
