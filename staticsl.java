/*key points to note 
1.For static variablels we can use class name,and we can use object name both of these things will work.
2.To access static variables we dont need an object.
3.Our main method is static thats why we dont need object to call main method.
4.constructors gets executed when we create an object.
5.Static block gets executed when the class gets load
6.Class gets loaded only once.



*/
import java.util.*;

class Student {
    int stid;
     static int standard;
    String name;
    static String teacherName;
    static {        //It is executed when we load the class.
        teacherName = "chodhary";
        standard =9;
        System.out.println("Inside the   static block");
    }
    
    public Student (){ // constructors gets executed when we create an object.
        stid = 13;
        
        name = "Raj";
        System.out.println("Inside the  constructors");
    }
    
    public void show() {
        System.out.println("studentId : " + stid + "\n" + "Standard : " + standard + "\n" + "Name : " + name
                + "\nTeacher name : " + teacherName);
    }
}

public class staticsl {
     static int i;
    public static void main(String[] args) {
        i=10;
        Student nanda = new Student();
        nanda.stid = 12;
        // nanda.standard = 3;
        nanda.name = "Nanda Kumar";
        // nanda.teacherName = "John";
        Student ram = new Student();
        ram.stid = 13;
        // ram.standard = 3;
        ram.name = "Ram Kumaran";
        // ram.teacherName = "Justin";
        nanda.show();
        ram.show();
    }

}