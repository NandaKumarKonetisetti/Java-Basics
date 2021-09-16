/* Key points about the constructor
1.Member method.
2.Same name as class aname.
3.It will never return anything.
4.Generally it is used to allocate memory.
*/
import java.io.*;
import java.util.*;

class value {
    int value1;
    int value2;
    int value3;
   public  value() {
        value1=9;
        value2 = 7;
        value3=28;
        System.out.println(value1+","+value2+","+value3);
        System.out.println("It is a default constructor");
    }

    value(int num1, int num2) {
        value1 = num1;
        value2 = num2;
        value3 = value1+value2;
        System.out.println(value3);
        System.out.println("It is another constructor of the same class");
    }

    value(int num1,int num2,int num3) {
        value1 =num1;
        value2=num2;
        value3 = num3;
        System.out.println("It is also a another constructor of the same class");
        System.out.println("If  a Class has more than one Constructors then it is said to be a constructor overloading ");
    }
}

public class constrctor {
    public static void main(String [] args) {
        value obj =new value(1,2);
        value obj1 =new value();
    }

}
/* Key points about the constructor
1.Member method.
2.Same name as class aname.
3.It will never return anything.
4.Generally it is used to allocate memory.
*/