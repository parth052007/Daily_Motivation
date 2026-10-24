import java.io.*;
public class fiiledemo{
public static void main(String[] args) throws IOException {
    File file = new File("student.txt");
    
    if(file.createNewFile()){
        System.out.println("file is created :");
    }
    else{
        System.out.println("file is already existes");
        System.out.println("exists:"+file.exists());
        System.out.println("get name:"+file.getName());
        System.out.println("get absolute path:"+file.getAbsolutePath());
        System.out.println("is file:"+file.isFile());
        System.out.println("is directory:"+file.isDirectory());
        System.out.println("get path:"+file.getPath());
        
}
}
}