import java.io.BufferedReader;
import java.io.InputStreamReader;

public class checkedExcption {
   public static void main(String [] args )throws Exception{
       int n=0;
       System.out.println("Enter the value");
       BufferedReader br=null;
       try {
       //InputStreamReader isr = new InputStreamReader(System.in);
        br = new BufferedReader(new InputStreamReader(System.in)); //Here we are taking the input only once from the user,so no need to create an object for InputStreamReader(as like above line ) we can directly pass it in the BufferedReader
       n = Integer.parseInt(br.readLine()); 
    }
    catch(Exception e ){
        System.out.println(e.getMessage());
    }
    finally {
        br.close();
        System.out.println("Resource Closed");
    }
    System.out.println(n);
   }
}