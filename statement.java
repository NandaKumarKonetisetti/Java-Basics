import java.io.*;
import java.util.Scanner;
class statement {
    public static void main(String args[]) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of the day that you want my dear Friend!!");
        char day =s.next().charAt(0); // READING CHARACTER FROM THE USER
        switch(day) {
            case 'A':
            System.out.println("Monday");
            break;
            case 'B':
            System.out.println("Tuesday");
            break;
            case 'C':
            System.out.println("Wednesday");
            break;
            case 'D':
            System.out.println("Thursday");
            break;
            case 'E':
            System.out.println("Friday");
            break;
            case 'F':
            System.out.println("Saturday");
            break;
            case 'G':
            System.out.println("Sunday");
            break;
            default:
            System.out.println("you Entered the mismatch value");
            break;
            
        }
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the month my dear!!");
        String month = sc.nextLine();
        switch(month) {
            case "jan":
            System.out.println("January");
            break;
            case "feb":
            System.out.println("February");
            break;
            case "mar":
            System.out.println("March");
            break;
            default:
            System.out.println("you Entered the mismatch value");
            break;
        }
    }
    
}