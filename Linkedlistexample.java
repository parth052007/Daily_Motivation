import java.util.*;
public class Linkedlistexample {
    public static void main(String[] args) {
     LinkedList <String> names = new LinkedList<>();
     names.add("parth");
     names.add("pranay");
     names.add("nakashe");
     names.add("yadnesh");
     System.out.println("proper list is:"+names);
    System.out.println("element at index 1 is:"+names.get(1));
    System.out.println("first element is :"+names.getFirst());
    System.out.println("last element is :"+names.getLast());
    System.out.println("pranay is changed to suyash:"+names.set(1,"suaysh")); 
    System.out.println("size of list is:"+names.size());
    System.out.println("first element is:"+names.peek());
    System.out.println("last element is :"+names.poll());  
    }
}
