/*DYNAMIC METHOD DISPATCH  
Key points to remeber 
1.In ths we can call method by creating  a reference of super class and the object of subclass
2.after the creation of super class and the object of subclass we can call only the methods of subclass that are already present  in syoerclass
3.We cannot call those methods of subclass that are not present in super class.
4.It is also called as Runtime polymorphism in java.

*/

class A {
    public void print() {
        System.out.println("In Class A");
    }

 

}

class B extends A {
    public void print() {
        System.out.println("In class B");
    }

    public void show() {
        System.out.println("In class B inside show");
    }

}

public class dyamicMethodDispatchDemo {
    public static void main(String args[]) {
        A ob = new A(); // creating reference and object of super class.
        A obj = new B();  // creation of reference of super class and object of subcclass.
        ob.print();
        obj.print();

    }
}