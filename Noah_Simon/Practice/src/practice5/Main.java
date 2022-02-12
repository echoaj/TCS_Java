package practice5;


import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String [] options = {"rock", "paper","scissors"};
        int userInput;
        int compInput;


        System.out.println("[1]rock [2]paper [3]scissors");

//      Player Part
        System.out.println("Player 1 pick [1 - 3]: ");
        userInput = scan.nextInt();
        System.out.println(userInput);
        String playerChoice = options[userInput-1];
        System.out.println("Player 1 chose " + playerChoice);

//      Computer Part

        compInput = rand.nextInt(3);
        System.out.println(compInput);



    }

}
