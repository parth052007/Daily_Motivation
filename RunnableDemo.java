public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = ()->{
            for (int i = 0;i<5;i++)
            System.out.println("task is running:"+i);
        };
        Thread t1 = new Thread(task);
        System.out.println("numbers print sucessfully");
                t1.start();

    }
}
