package package1;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.push(5);
        q.push(6);
        q.push(8);
        System.out.println(q.peek());
        q.pop();
        q.display();
    }
}
