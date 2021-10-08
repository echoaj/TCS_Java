import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {

    public ArrayList<T> list = new ArrayList<T>();

    public Stack(){}

    public void push(T data){
        list.add(data);
    }

    public void pop(){
        if(!list.isEmpty()){
            list.remove(list.size()-1);
        }else{
            System.out.println("Stack is empty. Can't pop.");
            throw new EmptyStackException();
        }
    }

    public T peek(){
        if(!list.isEmpty()){
            return list.get(list.size()-1);
        }else{
            System.out.println("Stack Empty. Can't peek.");
            throw new EmptyStackException();
        }
    }

    public int length(){
        return list.size();
    }

    public void clear(){
        list.clear();
    }

    public void display(){
        System.out.println(list);
    }
}

