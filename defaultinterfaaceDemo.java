interface demo{
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





public class defaultinterfaaceDemo {
    public static void main(String [] args) {
        demo d = mew nanda();
        d.show();
        d.run();

    }
    
}