public class Demo {
    public <t> void  display(t value){
    System.out.println("value is :"+value);
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display(23);
        d.display("parth");
        d.display(12.5);
    }
    
}
