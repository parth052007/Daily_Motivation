import java.util.Scanner;

public class exception {
    
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        try {
            int a;
            int b;
            
            System.out.println("enter element of a:");
            a=sc.nextInt();

            System.out.println("enter b :");
            b = sc.nextInt();

            System.out.println("division is :"+a/b);
        }
        catch(ArithmeticException e){
        System.out.println("error occured");
        }
        finally{
            System.out.println("calculation completed");
        }
    }
}
