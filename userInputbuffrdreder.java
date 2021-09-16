import java.io.BufferedReader;

import java.io.InputStreamReader;



public class userInputbuffrdreder {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Enter the value");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(isr);
        int n  = Integer.parseInt(br.readLine());   // It will take the input in the form of the string 
        

        System.out.println(n);

      
    }

}