import java.util.*;
import java.io.*;
class number {
    public static void main(String args[])
    {
         int ans=0,place=1,rem;
         //To convert the number into binary 
         Scanner s =new Scanner(System.in);
         System.out.println("Enter the value");
          int num  =s.nextInt();
         while(num>0) {
             rem =num%2;
             ans =ans+(rem*place);
             place*=10;
             num=num/2;
         }
         System.out.println("The  binary value of a given number is  "+ans);


         // to convert the binary value in normal form
         int num1,ans1=0,place1=1,rem1;
         
         System.out.println("Enter the value in binary form");
         num1=s.nextInt();
         while(num1>0) {
             rem1 =num1%10;
             ans1 =ans1+(rem1*place1);
             place1*=2;
             num1/=10;
         }
         System.out.println("the value in normal form is "+ans1);
    }
    
}