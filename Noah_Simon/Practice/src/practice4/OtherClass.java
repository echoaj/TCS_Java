package practice4;

public class OtherClass {

    private final TestInterface ti;


    OtherClass(){
        ti = this::fun;
    }

    public void method(){
        System.out.println(ti.function(500));
    }

    public boolean fun(int num){
        System.out.println("FROM OtherClass fun: num=" + num);
        return false;
    }
}
