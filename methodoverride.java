class A { 
    
    public void display(){
        
        System.out.println("In class A");
    }
   
}
class B extends A {
    @Override // It helps to get an error if the method of super class is not overrided by sub class.
    public void display(){
        
        System.out.println("In Class B");
    }
    
    
   
    

}

public class methodoverride {
    public static void main(String [] args)
    {

      B obj = new B();
      obj.display();
    }
    
}