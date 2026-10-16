public class wrapper {
public static void main(String[] args) {
    

String a ="100";
String b = "200";
int x = Integer.parseInt(a);
int y = Integer.parseInt(b);
int sum = x+y;
System.out.println(sum);

//autoboxing
int p = sum;
Integer q  = p;
System.out.println(q);
 // unboxing 
Integer c = sum;
int d = c;
System.out.println(d);

}
}