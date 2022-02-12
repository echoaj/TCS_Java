package practice2;

// child class
public class Circle extends Shape{

    int radius;

    Circle(String nm, int rad) {
        super(nm);
        radius = rad;
    }

    void getArea(){
        double total = Math.PI * Math.pow(radius, 2);
        System.out.println(total);
    }


}
