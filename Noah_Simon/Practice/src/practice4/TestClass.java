package practice4;

public class TestClass implements TestInterface{

    public boolean function(int num) {
        System.out.println("FROM TestClass: num=" + num);
        return true;
    }
}
