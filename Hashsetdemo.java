import java.util.*;
public class Hashsetdemo {
    public static void main(String[] args) {
        HashSet <String> hash = new HashSet<>();
        hash.add("java");
        hash.add("python");
        hash.add("c++");
        hash.add("react");
        System.out.println("All Skills Are:"+hash);
        System.out.println(hash.contains("react"));
        hash.remove("c++");
        System.out.println("final set is:"+hash);
        System.out.println("size of final set is:"+hash.size());
    }
}
