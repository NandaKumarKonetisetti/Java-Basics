import java.io.*;
import java.util.*;

class string {
    public static void main(String args[]) {
        System.out.println("Enter the String:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("The string you entered is " + name);
        char[] ch = name.toCharArray();
        int length = 0;
        for (char c : ch)
            length++;
        System.out.println("The length of the string is " + length);
        System.out.println();
        for(int row = 0; row < length ; row++,System.out.println("\n")){
            for(int col = 0 ; col <=length ; col++) {
                if(row == col || row+col==length-1) {
                    System.out.print(ch[col]);
                }
                else
                System.out.print(" ");
            }

            
        }
       
    }

}