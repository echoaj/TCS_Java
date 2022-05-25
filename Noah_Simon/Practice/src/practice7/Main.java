package practice7;



class Singleton {
    private static Singleton INSTANCE;
    private Singleton(){ System.out.println("Object");}
    public static Singleton getInstance() {
        if(INSTANCE == null) {INSTANCE = new Singleton();}
        return INSTANCE;
    }
}

public class Main {

    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

    }
}
