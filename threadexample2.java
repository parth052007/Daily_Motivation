public class threadexample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{ // lambda function used here 
System.out.println(Thread.currentThread().getName());
        } ,"worker");
        t1.start();
    }
}
