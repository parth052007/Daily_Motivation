import java.util.concurrent.*;
import java.util.concurrent.Callable;
public class Callablelambda {
     public static void main(String[] args) throws Exception {
        Callable<Integer> task = ()->{
            int a= 10;
            int b= 20;
            return a+b;
        };
        int result = task.call();
        System.out.println("additioon is:"+result);
     }   
}
