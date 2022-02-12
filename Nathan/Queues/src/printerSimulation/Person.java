package printerSimulation;
import java.util.Random;




public class Person {

    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";
    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_WHITE = "\u001B[37m";

    Random rand = new Random();
    int id;
    int pages;
    float print_time;
    float total_wait;

    // Constructor
    Person(int id){
        this.id = id;
        pages = rand.nextInt(25) + 1;
        print_time = Math.round(((float)pages / 6) * 10) / 10.0f;
        total_wait = 0.0f;
    }

    void status(){
        System.out.println(ANSI_GREEN + "Person " + id + " | Pages -> " + pages + " | print time -> " + print_time + " | total wait -> " + total_wait + ANSI_RESET);
    }

    void finish(){
        System.out.println(ANSI_BLUE + "Person " + id + " has finished" + ANSI_RESET);
    }

}
