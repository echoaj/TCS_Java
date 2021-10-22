package practice3;


import java.util.ArrayList;

public class Practice3 {


    public static void main(String[] args) {

        // Shape object
        Shape s = new Shape("Triangle");
        s.display();

        Shape d = new Shape("Triangle");
        d.display();

        Shape e = new Shape("Triangle");
        e.display();

        System.out.println(Shape.amount);

        Circle c = new Circle("oval",4);
        System.out.println(c.get_area());
        c.display();

        Rectangle r = new Rectangle("recy", 3, 4);
        System.out.println(r.getArea());
        r.display();

        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(50);
        alist.add(40);
        alist.forEach( (num) -> {
            System.out.println(num * 100);
        } );

        // Polymorphism
        Integer num = 5;
        Float dec = 30.5f;
        Double dub = 284.493;
        String str = "hello world";
        Number[] arr = {num, dec, dub};
        Object[] arr2 = {num, dec, dub, str};
        for(int i = 0; i < 3; i++){
            System.out.println(arr[i]);
        }

    }

}
