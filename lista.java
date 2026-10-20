import java.util.*;
public class lista {
    public static void main(String []args){
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        names.add("suaysh");
        names.add("pranay");
        names.add("parth");
        names.add("yash");
        number.add(5);
        number.add(45);
        number.add(56);
        number.add(67);
        //add element at specific index
        names.add(2,"yadnesh");
        number.set(2,34); //replacing element using index
        names.remove(1); //removing element by using index
        names.remove("yash"); // remove matching element
        names.contains("parth");//check wheather the element is present or not 
        System.out.println(names);
        System.out.println(number);
        System.out.println(number.get(1));//accesing using index number
        System.out.println(names.get(2));//same as above
        System.out.println("size of names are:"+names.size());
        System.out.println(names.isEmpty());
    }
    
}
