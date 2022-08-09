package practice4;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int user_input = 0;
        boolean loop = true;

        while (loop){
            loop = false;
            System.out.println("Enter a number: ");
            user_input = scan.nextInt();
            switch (user_input) {
                case 1 -> System.out.println("You entered 1");
                case 2 -> System.out.println("You entered 2");
                case 3 -> System.out.println("You entered 3");
                case 4 -> System.out.println("You entered 4");
                default -> {
                    System.out.println("You entered something else");
                    loop = true;
                }
            }
        }
    }

}
