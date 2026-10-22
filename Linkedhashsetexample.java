import java.util.LinkedHashSet;
import java.util.Scanner;

public class Linkedhashsetexample {
    Scanner sc = new Scanner(System.in);
    LinkedHashSet <String> stdname = new LinkedHashSet<>();
    public void register (){
        System.out.println("enter name of student:");
        String name = sc.nextLine();
        if (name.isEmpty()){
            System.out.println("enter valid name!!!");
            return;
        }
        boolean added = stdname.add(name);
        if(added){
            System.out.println("Registration done sucessfully!!");

        }
        else{
            System.out.println("already registered!!");
                }
    }
    public static void main(String[] args) {
        Linkedhashsetexample e = new Linkedhashsetexample();
        e.register();
        e.register();
        e.register();
        System.out.println("registered student is :"+e.stdname);
    }
}
