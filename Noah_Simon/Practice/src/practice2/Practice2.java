package practice2;

import java.util.ArrayList;
import java.util.Hashtable;

public class Practice2 {

    public static void main(String[] args) {
        // Shape object
        Shape s = new Shape("My Shape");
        Shape s1 = new Shape("My Shape2");
        Shape s2 = new Shape("My Shape3");

        System.out.println(Shape.amount);
        System.out.println(Shape.amount);
        System.out.println(Shape.amount);

        Shape c = new Circle("Circle", 60);
        Rectangle r = new Rectangle("Rect", 5, 10);

        Shape[] circArray = {c,c,c,c,s,r,r,s};

        Integer num1 = 4;
        Float num2 = 3.8f;
        Double num3 = 76.589045;
        String str2 = "hello";

        Object[] arr4 = {num1, num2, num3, str2};

//        ArrayList<Integer> alist = new ArrayList<>();
//        alist.add(30);
//        alist.add(34);
//        alist.add(38);
//
//        alist.forEach( (num) -> {
//            System.out.println(num * 100);
//        } );



    }

}
