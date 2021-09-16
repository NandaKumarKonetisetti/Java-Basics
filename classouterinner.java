import java.io.*;
import java.util.*;

class outer {
    
    public  void show() {
        System.out.println("This is outerClass inside Show method");
    }

    class inner {
        
        public void display(){
            System.out.println("This is display method inside innerclass");
        }
    }
}
public class classouterinner{
    public static void main(String[] args) {
        outer obj= new outer();
        obj.show();
        outer.inner obj1 = obj.new inner();

       // outer.inner obj1 = new outer.inner();  => * if the inner class is static we can access that class with the outer class name without using  the outer class object.
        obj1.display();

    }
    
}