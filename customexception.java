public class customexception extends Exception{
    
   
    
    public customexception(String Message){
        super(Message);
    }
    public static void main(String[] args) {
        try{
        throw new customexception("invalid age");

        }
        catch(customexception e) {
            System.out.println(e.getMessage());
            
        }
    }
    
}
