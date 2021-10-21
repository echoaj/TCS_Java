package practice2;

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



    }

}
