public class finalexample {
    final String bankname = "SBI";
    void displaybank(){
        System.out.println("bank name is :"+bankname);
    }
}
    final class security extends finalexample{
        final void show(){
            System.out.println("your account is secured");
        }
    
    public static void main(String[] args) {
    security f = new security();
       
        f.show();
    }
    }

