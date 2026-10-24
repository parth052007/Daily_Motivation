import java.io.*;
public class filereaderdemo {
    public static void main(String[] args) {
        try{
        FileReader file = new FileReader("student.txt");
        int ch ;
        while((ch=file.read())!=-1){
        System.out.println((char )ch);
        }
        file.close();
        

        }
catch(IOException e){
    System.out.println("error occured:"+e.getMessage());
}
    }
}
