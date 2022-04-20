package practice6;


class Grand{
    int num = 1;
    Grand(){
        System.out.println(num);
    }
}

class Parent extends Grand{
    int num = 2;
    Parent(){
        System.out.println(num);
    }
}

class Child extends Parent {
    int num = 3;
    Child(){

        super();
        System.out.println(num);
    }
}

public class Main {



    public static void main(String[] args){
        Grand obj = new Child();
    }

}
