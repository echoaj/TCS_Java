package practice2;

public class Rectangle extends Shape{

    int width;
    int height;
    Rectangle(String nm, int w, int h) {
        super(nm);
        width = w;
        height = h;
    }

    void getArea(){
        int total = width * height;
        System.out.println(total);
    }

}
