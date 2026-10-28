import java.util.concurrent.Callable;

 public class callableclass implements Callable<Double> {
     private double a ;
     private double b;
    callableclass(double a, double b){
        this.a=a;
        this.b=b;
    }
    public Double call(){
        return a+b;
    }
}
 class Innercallableclass {

    public static void main(String[] args) throws Exception {
        callableclass cl = new callableclass(12, 210);
        double total = cl.call();
        System.out.println("total is:"+total);
    }
}
