import java.io.*;
import java.util.*;

class subject {
   

    public void display(int a,int b) {
      int   c=a+b;
        System.out.println("The sum of two numbers is"+c);

    }
    public void display(double d,double i ) {
         double f=d+i;
        System.out.println("hi"+f);

    }
    public void display(float a,float b) {
        float c=a+b;
        System.out.println("In display2 "+c);
    }
}

public class methodoverload {
    public static void main(String[] args) {
        subject mat =new subject();
        mat.display(4,5);
        mat.display(1.0,5.2);
        mat.display((float)2.0,(float)9.8);

    }

}