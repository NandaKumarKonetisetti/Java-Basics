class typing {
    public void show(Number i) {
        System.out.println(i);
    }
   
    
}
 abstract class working{
     public working(){
         System.out.println("parametrized constructor inside a super class");
     }
     public abstract void work();

}
class computer extends working {
    public computer(){
        
        System.out.println("Inside a computer in constructor");
    }
    public void work(){
        System.out.println("Working in my personal computer");
    }
    
}
class laptop extends computer {
    public void work(){
        System.out.println("working in my personal laptop");
    }
}





class abstract1 {
    public static void main(String [] args){
        typing obj = new typing();
    
        obj.show(1.9);
        working obj1;  // creating a reference
        obj1= new computer(); // creating a object 
        
        obj1 = new laptop();
        obj1.work();
        
    }
}
/*This is quite confusing be careful while revising 

*/