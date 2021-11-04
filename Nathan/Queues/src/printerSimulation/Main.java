package printerSimulation;

import package1.Queue;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Queue<Person> q = new Queue<>();
        int num;


        for(int i = 1; i < 50; i++){
            num = rand.nextInt(2);
            if(num == 0){
                // create new person object
                Person p = new Person(i);
                p.status();
                // push it on queue
                q.push(p);
            }else{
                // Check if queue is empty
                if(q.length() > 0) {
                    // Peek
                    Person p = q.peek();
                    // wait for amount of time
                    Thread.sleep((long) (p.print_time * 1000));
                    // pop person off
                    q.pop();
                    p.finish();
                }
            }
        }
    }
}
