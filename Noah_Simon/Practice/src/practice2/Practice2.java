package practice2;


public class Practice2 {

    public static int add(int x, int y){
        int total = x + y;
        return total;
    }

    public static float add(float x, float y){
        float total = x + y;
        return total;
    }

    public static void main(String[] args) {

        int sum = add(40, 60);
        System.out.println(sum);

        float sum2 = add(53.4f, 75.4f);
        System.out.println(sum2);

        // Shape object
        Shape s = new Shape(5, "Triangle");

    }

}
