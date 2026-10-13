import java.util.*;
public class studentregistration{
    Scanner sc = new Scanner(System.in);
    String name;
    String email;
    void insert(){
        System.out.println("enter name:");
        name = sc.nextLine();
        System.out.println("enter email:");
        email = sc.nextLine();
        if(email.contains("@") && email.contains(".")){
         System.out.println("good joob");
        }
        else{
        System.out.println("invalid  email");
        }
        if(name.isEmpty()){
            System.out.println("enter name");
            sc.close();
        }
        System.out.println("student name is :"+name);
        System.out.println("student email is :"+email);
    }
    public static void main(String[] args) {
        
    
    studentregistration c = new studentregistration();
    c.insert();
}
}