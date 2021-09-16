/* key points about interface
1.we cannot create instantiatton for an interace.
2.By default methods iside the interface are abstract methods.
3.the difference between interface and abstract are,in abstract we can define methods but in interface it is not possible to define methods.
        3.1in abstract all mehods need not to be abstract methods but in interface all methods by default were abstract methods.




*/
 
 
 
 
 
 interface system  {
    public  void show();
}


class Dell implements  system {
    public void show(){
        System.out.println("In Dell class");
    }
}
class acer implements system {
    public void show(){
        System.out.println("In acer classs");
    }
}
class laptop {
    public void display(system ob){
        ob.show();
    }
}

 public class interfaceDemo {
    public static void main(String[] args) {
        system d = new Dell();
        system ac = new acer();
        laptop l = new laptop();
        l.display(d);
        
    }

}