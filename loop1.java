import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

class loop1 {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 4; i > 0; i--) {
            for (int j = i + 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4)
                    System.out.print("  *   ");
                else
                    System.out.print("      ");
            }
            System.out.print("\n");
        }
        int i = 10;
        i++;
        ++i;
        System.out.println(i);
        System.out.println("\n");
        for (int row = 1; row <= 5; row++, System.out.println("\n")) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 5; col++) {

                System.out.print("*");
            }

        }
        System.out.println("*");
        System.out.println("\n");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int row = 1; row <= 5; row++, System.out.println("\n")) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 5; col++) {

                System.out.print("*");
            }

        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Hello welcome to java programmiong");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int row = 1; row <= 8; row++, System.out.println()) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 8 - row; space++) {
                System.out.print(" ");
            }
            for (int space = 1; space <= 8 - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

        }
        for (int row = 1; row <= 8; row++, System.out.println()) {
            for (int space = 1; space <= 8 - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 1; row < 5; row++, System.out.println(" ")) {
            for (int col = 1; col <= 5 + 1 - row; col++)
                System.out.print("*");
        }
        System.out.println("*");
        for (int row = 1; row <= 8; row++, System.out.println("\n")) {
            for (int col = 1; col <= 8; col++) {
                if (row == 1 || col == 1 || row == 8 || col == 8 || row == col || row + col == 8 + 1) {
                    System.out.print("1");

                } else {
                    System.out.print("0");
                }
            }
        }

        System.out.println("Hello java");
        System.out.println(" ");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (int row = 5; row >= 1; row--, System.out.println("\n")) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int space = 1; space <= (5 - row) * 2; space++)
                System.out.print(" ");

            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }
        for (int row = 1; row <= 5; row++, System.out.println("\n")) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int space = 1; space <= (5 - row) * 2; space++)
                System.out.print(" ");

            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }
        System.out.println("ohhhhhhhhhh");

        for (int row = 1; row <= 5; row++, System.out.println("\n")) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int space = 1; space <= (5 - row) * 2; space++)
                System.out.print(" ");

            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }




        for (int row = 5; row >= 1; row--, System.out.println("\n")) {
            for (int col = 1; col <= row; col++)
                System.out.print("*");
            for (int space = 1; space <= (5 - row) * 2; space++)
                System.out.print(" ");

            for (int col = 1; col <= row; col++)
                System.out.print("*");
        }
        System.out.println("Hello Nanda!!!");

        for (int row = 1; row <= 5; row++, System.out.println("\n")) {
            if (row % 2 == 0) {
                System.out.print(row + 1 + " ");
            }
            for (int col = 1; col <= 5; col++)
                System.out.print(row + " ");
            if (row % 2 == 1) {
                System.out.print(row + 1);
            }
        }
        for(int row=1;row<=4;row++,System.out.println("\n")){
            for(int col=1;col<=row;col++)
            System.out.print("*");
        }
        for(int row=4;row>=1;row--,System.out.println("\n")){
            for(int col=1;col<=row;col++)
            System.out.print("*");
        }
        for(int row=1;row<12;row++,System.out.println("\n")) {
            for(int col=1;col<12;col++){
                if(row==(12/2)+1 || col==(12/2)+1)
                System.out.print("* ");
                else 
                System.out.print(" ");
            }
            
        }
        for(int row=1;row<=5;row++,System.out.println()){
            for(int col=1;col<=row;col++){ 
                if(row==1||col==1||col==row||row==5)
               System.out.print("*");
               else
               System.out.print(" ");

        }
    }
       
        
        for ( int row = 1; row<=5 ; row++,System.out.println()){
            for (int col=1;col<=5;col++){
               if(row==col || row+col==6)
                System.out.print(" * ");
                else 
                System.out.print("   ");
            }
        }
        
       
        
        System.out.println("Arrays in Java");
        
        // int [] array = {1,2,3,4,5,6};
        // for(int index=0;index<array.length;index++)
        // System.out.println(array[index]);
        // System.out.println(array.length);
        
        System.out.println("Enter the size of an array");
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int a[]= new int[n];
        int sum=0;
        for(i=0;i<n;i++) {
            System.out.println("Enter the array values");
            a[i] = s.nextInt();
            sum=sum+a[i];
        }
        for(i=n-1;i>=0;i--){
            sum=sum-a[i];
            a[i]=sum;

        }
       
        for(i=0;i<n;i++) {
            
            System.out.println(a[i]);
        }
        
    }

}
