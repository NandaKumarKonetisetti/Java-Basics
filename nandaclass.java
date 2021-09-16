import java.util.*;
import java.io.*;
class Sum
{
    
    int a;
    int b;
    int sum;

 public  void add()
 {
    sum = a+b;
    System.out.println("The sum of the given two numbers are "+sum);
}


}


class nandaclass {
    public static void main(String args[])
     {
        Sum obj =new Sum();
        obj.a=90;
        obj.b=100;
        obj.add();
   
    }
    
}