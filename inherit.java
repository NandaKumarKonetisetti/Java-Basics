class A {
   
    public  void add(int a,int b){
        int c=a+b;
    System.out.println("The sum of two numbers is "+c);
        
    }
}
class B extends A {
    public  void sub(int d,int e){
        int f =d-e;
        System.out.println("The Substraction of two numbers are "+f);
    }
}
class C extends B {
    public  void multiply(int g,int h) {
        int i =g*h; 
    System.out.println("The multiplication of two numbers is "+i);
    }
}

class inherit {
    public static void main(String[] nanda) {
   A obj = new A();
   obj.add(4,3);
   System.out.println("**************************");
   B obj1 = new B();
   obj1.add(4,5);
   obj1.sub(14,7);
   System.out.println("**************************");

   C obj2 = new C();
   obj2.add(2,5);
   obj2.sub(7,9);
   obj2.multiply(7,9);
        
    }
    
}