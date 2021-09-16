import java.io.*;
import java.util.Scanner;
class input {
    public static void main(String args[]) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the integer value");
        int val = s.nextInt();
        System.out.println("The value you entered is "+val);

        System.out.println("Enter any character");
        char a=s.next().charAt(0);
        System.out.println("The character you entered "+a);

        System.out.println("Enter any String my dear Friend");
        
        String c =s.next(); //next() is used to get only one string i mean without any space
        System.out.println(c);

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String my dear Friend"); 
        String name = sc.nextLine(); 
        //whereas nextLine() is used to get more than one string with spaces ,until we press the enter button it can accept many Strings 
        System.out.println("The String that you entered is "+name);
        System.out.println("The length of the string is"+name.length());
        int value =s.nextInt();
        System.out.println(value);
    }
}