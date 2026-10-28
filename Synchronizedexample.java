class demo{
    int balance = 1000;
    synchronized  void withdraw(int amount){
    if(balance >=amount){
        System.out.println(Thread.currentThread().getName()+"is withdrawing!!");
    
    balance = balance- amount;
    System.out.println("withdraw amount is :"+amount);
    }else{
        System.out.println("insufficeint amount");
    }

    }
}

public class Synchronizedexample{
    public static void main(String[] args)throws InterruptedException {
        
    
     demo d = new demo();
     Thread t1 = new Thread(()-> d.withdraw(200),"thread 1");
     Thread t2 = new Thread(()-> d.withdraw(100),"thread 2");
     t1.start();
     t2.start();
     t1.join();
     t2.join();
     System.out.println("remaining balance is :"+d.balance);

    }
}
