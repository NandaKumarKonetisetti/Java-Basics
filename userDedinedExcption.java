class myException extends Exception {
    
// String str;
    public myException(String s) {
        // str =s;
        super(s);

        

    }
    // public String toString(){           // if we wanna call this method we must put only object(this means e) not the message(e.getMessage())
    //     return ("My Exception occurred "+str);
    // }
}
public class userDedinedExcption {
    public static void main(String [] args) {
        int num=7;
        int denom = 8;
        try{
            int divide = num/denom;
            if (divide == 0)
                throw new  myException("the denominator is greater than the numerator");
                System.out.println(divide);
        }
        catch(myException e) {
            System.out.print("Error occurred "+e.getMessage());
        }
    }
    
}