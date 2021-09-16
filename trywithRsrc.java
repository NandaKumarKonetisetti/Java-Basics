import java.io.BufferedReader;
import java.io.InputStreamReader;
public class trywithRsrc {
    public stattic void main(String [] args) { 
        int n=0;
        BufferedReader br;
        System.out.println("Enter the value");
        try{
         br = new BufferedReader(new InputStreamReader(System.in));
         n= Integer.parseInt(br.readLine());
         } 
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
        }   
    
}