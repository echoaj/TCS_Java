import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Stack<Integer> s = new Stack<>();

        s.display();
        s.push(10);
        s.push(35);
        s.push(90);
        s.display();

        s.pop();
        s.pop();
        s.display();

        String str = "[ 1 2 3 4 [ 10 30 50 [ 100 350 [ 1000 4500 9000 ] ] 60 80 ] ]";
        // Results:  9000 4500 1000 350 ......
        List<String> list = new ArrayList<String>(Arrays.asList(str.split(" ")));
        Stack<String> s2 = new Stack<>();

        for(String ch: list){
            if(!ch.equals("]") && !ch.equals(" ")){
                s2.push(ch);
            }else if(ch.equals("]")){
                String item = s2.peek();
                while(!item.equals("[")){
                    System.out.print(item + " ");
                    s2.pop();
                    item = s2.peek();
                }
                s2.pop();
            }

        }

    }
}