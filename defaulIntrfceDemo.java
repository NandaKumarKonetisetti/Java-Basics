/*1.In Interfaces it is not possible to declare a datatype(int a) but it is possible to assign the values at the same time(int a=10) 
2.Even we can define many number of default methods inside a functional interface but it is not possible to define actual methods
3.the data type values inside an interface were by default constants
*/


@FunctionalInterface
interface demo{
    int a=7;
     void run();
    default void display(){
        System.out.println("Inside the default display method ");
    }
}

class nanda implements demo {
    public void run(){
        System.out.println("Inside the run method");
    }

}





public class defaulIntrfceDemo {
    public static void main(String [] args) {
        demo d = new nanda();
        d.display();
        d.run();

    }
    
}