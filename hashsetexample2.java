import java.util.Scanner;
import java.util.HashSet;
public class hashsetexample2 {
    Scanner sc = new Scanner(System.in);
    HashSet <String> hash = new HashSet<>();
    public void Storerequest(){
        System.out.println("enter request id:");
        String requestid = sc.nextLine();
        if (requestid.isEmpty()){
            System.out.println("none");
            return;
        }
        boolean added = hash.add(requestid);
        if (added){
            System.out.println("request granted");

        }else{
            System.out.println("invlid id ");
        }
    
    }
    public static void main(String[] args) {
        hashsetexample2 obj = new hashsetexample2();
        obj.Storerequest();
        obj.Storerequest();
        obj.Storerequest();
    }
    
}
