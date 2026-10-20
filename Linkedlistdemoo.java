import java.util.*;
public class Linkedlistdemoo {
    public static void main(String[] args) {
        
    
    LinkedList<String> customers = new LinkedList<>();
    customers.add("parth");
    customers.add("suyash");
    customers.add("yadnesh");

    System.out.println("current customer is:"+customers.peek());
    customers.poll();
    System.out.println("next customer is :"+customers.peek());
    System.out.println("last customer is :"+customers.getLast());

    
}
}
