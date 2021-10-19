package practice3;

public class Rectangle extends Shape{

    int width, height;

    Rectangle(String nm, int w, int h) {
        super(nm);
        width = w;
        height = h;
    }

    public int getArea(){
        return width * height;
    }

}
