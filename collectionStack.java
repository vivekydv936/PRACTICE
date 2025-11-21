import java.util.*;
public class collectionStack {
    public static void main(String[] args) {
        Stack<Integer> mystack = new Stack<>();
        mystack.push(19);
        mystack.push(1);
        mystack.push(10);
        mystack.pop();
        mystack.pop();
       
        System.out.println(mystack.peek());

    }
}
