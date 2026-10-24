import java.io.FileWriter;

import java.io.IOException;

public class filewriterdemo {
    public static void main(String[] args) {
        try(FileWriter fr = new FileWriter("student.txt",true)){

            fr.append("parth");
            
        }
        catch(IOException e){
        System.out.println("erro occured:"+e.getMessage());
        }
    }
}
