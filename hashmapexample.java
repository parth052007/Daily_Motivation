import java.util.*;
import java.util.HashMap;

public class hashmapexample {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(101,"parth");
        m1.put(102,"shreysh");
        m1.put(103, "suyash");
        System.out.println("102 roll no is:"+m1.get(102));
        System.out.println("checking 104 is present or not:"+m1.containsKey(104));
        System.out.println("removing record of 103:"+m1.remove(103));
        System.out.println("size is :"+m1.size());
    }
}
