package practice5;
import java.util.ArrayList;
import java.util.Iterator;

class Class1 {
    public void method1(){

    }
}

class Class2 extends Class1 {
    public void method2() {

    }
}

public class Main2 {


    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        int[] array = {1,2,3,4,5,6};
        int target = 4;

        for(int i : array){
            if (i == target){
                System.out.println("Found");
            }
        }

        String s = "hello";

        System.out.println(s.substring(1, 4));

    }

}

