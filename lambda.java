interface functional{
    void show();
}

public class lambda {
    public static void main(String[] args) {
        functional f =() ->{ // creation of lambda
            System.out.println("hello");
        };
        f.show();
    }
}
