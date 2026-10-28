class Runnableexample  implements Runnable{
     public void run(){
        System.out.println("opening files");
    }
}
public class child extends Runnableexample{
    @Override
    public void run(){
       System.out.println("downloding files");
    }


    public static void main(String[] args) {
        Thread t1= new Thread(new Runnableexample());
        Thread t2 = new Thread(new child());
        t2.start();
        t1.start();
    }

}
    


