class A {
    int number = 100;
      public A() {
        System.out.println("In Class A");
    }
    public A(int a) {
        System.out.println("in classs A Single parametric");
    }
    public void  show(){
        System.out.println("This is the super class");
    }
}
class B  extends A{
    public B() {
        super(7);
        System.out.println(super.number);
        System.out.println("In class B");
    }
       public B(int b) {
          
           System.out.println("In class B Single parametric");
       
        }
    
}



public class superkeyword {
    public static void main(String args[]) {

        B obj = new B();
        obj.show();

    }
    
}