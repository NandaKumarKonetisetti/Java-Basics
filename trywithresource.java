/* Without using catch and finallly blocks we can do only with try block by declaring the parenthesis and iside the paranthesis we will declare the resource input statement(BufferedReader) 
if we declare like this the resource will close automatically and no need to close the resource using finally block.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class trywithresource {
    public static void main(String [] args)  throws Exception{ 
        int n=0;
        
        System.out.println("Enter the value");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
         
         n= Integer.parseInt(br.readLine());
         } 
        
      
         System.out.println(n);
        }   
    
}