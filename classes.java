import java.io.*;
import java.util.*;
class sum {
    int a;
    int b;
    int sum;

     public void sum1() {
         sum = a + b;
        System.out.println("The sum of the given two numbers are " + sum);
     }
}

class classes {

    public static void main(String args[])

     {
        sum obj = new sum();
       obj.a = 10;
       obj.b = 20;
       obj.sum1();

    }

}
