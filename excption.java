//Remember all the exceptions(Arithemetic,Runtime,etc ...) are the subclasses of the superclass "Exception".
// finally is a block that can be executed if you get or can't get an exception.


public class excption {
    public static void main(String [] args) {
        try {
            int num =10;
            int denom = 0;
           int division=num/denom;
        System.out.println(division);
        
        }
        catch(ArithmeticException e) {
            System.err.println(e.getMessage());
         
        }
        finally {
            System.out.println("successfully compiled");
        }
    }
    
}