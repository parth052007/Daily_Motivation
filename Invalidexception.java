
import java.util.Scanner;

class Invalidage extends Exception {

    public Invalidage(String message) {
        super(message);
    }
}

public class Invalidexception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            checkAge(age);
            System.out.println("Registration successful!");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        catch (Invalidage e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    static void checkAge(int age) throws Invalidage {

        if (age < 18) {
            throw new Invalidage("Age must be 18 or above!");
        }
    }
}
