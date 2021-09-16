import java.io.*;
import java.util.*;
class Data {
    public static void main(String args []) {
        double value = 5;  // it is said to be a implicit conversion because internally it is automatically converting and showing output as 5.0
        System.out.println(value);
        int val1 = (int)5.9;  // explicit conversion int => 4bytes ->32bits and its range =->-2,147,483,648 to 2,147,483,647  // it is type casting
        System.out.println(val1);
        int val = 9000_0_00;   // in Between the numbers we can use underscore too it makes the bigger number to make more readable and understandable
        System.out.println(val);
        float val2 = 5.6f; // in java the float value must end with f 
        System.out.println(val2);
        long val3 = 3999_9999_9999_888l;   // in java the long value must ends with l 
        System.out.println(val3);
        short sh = 4;   // short =>2bytes and it is=> 16bits ab its range=> -32768 to 32767
        System.out.println(sh);
        char c = 'a';
        System.out.println(c);
        c=67; // here c prints the ASCII value related to the number 67 American Standard code for information interchange
        System.out.println(c);
        byte b =127;  // byte=>1byte and it is =>16bits and its range is =>-128 to 127
        System.out.println(b);
       }
}