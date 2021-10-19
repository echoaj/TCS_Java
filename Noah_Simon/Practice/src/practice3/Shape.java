package practice3;


public class Shape {

    static int amount = 0;
    private String name;

    // Constructor
    public Shape(String nm){
        amount += 1;
        name = nm;
    }

    void display(){
        System.out.println(String.format("%d shape(s) so far", amount));
    }
}