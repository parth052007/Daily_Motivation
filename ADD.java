interface InnerADD {
void take();
    
}
public class ADD{
    public static void main(String[] args) {
        InnerADD ad =()->{
            System.out.println("parth");
        };
        ad.take();


    }
}