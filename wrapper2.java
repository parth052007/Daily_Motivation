public class wrapper2 {
    public static void main (String [] args){

        String salary = "100000";
        String bonus ="2000";

        int s1 = Integer.parseInt(salary);
        int b1 = Integer.parseInt(bonus);
        
        int total = s1 +b1;
        System.out.println("total salary is:"+total);
        //autoboxing
        int a =total;
        Integer b = a;
        System.out.println("autoboxing is :"+b);

        //unboxing
        Integer c =total ;
        int d =100 +c;
        
        System.out.println(d);
    }
}
