import java.util.Scanner;

public class exceptionexample {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount;
    int balance;
    System.out.println("enter balance:");
    balance = sc.nextInt();
    System.out.println("enter amount to be withdraw:");
    amount =sc.nextInt();
    try {
        if (balance<=0){
            throw new IllegalArgumentException( "Invalid withdrawal amount!");

        }
        if(amount<= balance){
            throw new IllegalArgumentException("amount withdraw sucessfully");
        }

    }
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }

    }
}