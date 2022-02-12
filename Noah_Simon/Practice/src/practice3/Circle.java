package practice3;

public class Circle extends Shape{

    int radius;

    public Circle(String name, int rad){
        super(name);
        radius = rad;
    }

    double get_area(){
        return Math.PI * Math.pow(radius, 2);
    }
}
