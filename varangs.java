
    import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
    class add  {

    public static void addition(int... n){ //Here the values comes in the form of an array {4,5,6,7,8,9,10}
        int sum=0;
        System.out.println("The integer values that you entered are "+n.length);
        for(int k:n){
            
            System.out.print(" "+k);
            
            sum=sum+k;
        }
        System.out.println();
        
        
        System.out.println("Sum of the given entered values are "+sum);
        System.out.println();
        System.out.println("***************************"); 
        System.out.println();
        System.out.println();
    }
    public static void ad(char... c){ 
        
        System.out.println("The Character values that you entered are "+c.length);
        for(char  l:c){
            
            System.out.print(" "+l);
            
            
        }
        System.out.println();
        
        
        
        System.out.println();
        System.out.println("***************************"); 
        System.out.println();
        System.out.println();
    }
    public static void addouble(double... d){ 
        
        System.out.println("The Character values that you entered are "+d.length);
        double data=0.0;
        for(double m:d){
            
            System.out.print(" "+m);
            data+=m;
            
        }
        System.out.println();
        System.out.println("The sum of the double values are "+data);
        
        
        
        System.out.println();
        System.out.println("***************************"); 
        System.out.println();
        System.out.println();
    }
    public static void adstr(String... s){ 
        
        System.out.println("The String values that you entered are "+s.length);
        for(String o:s){
            
            System.out.print(" "+o);
            
            
        }
        System.out.println();
        
        
        
        System.out.println();
        System.out.println("***************************"); 
        System.out.println();
        System.out.println();
    }
    public static void adfloat(float... f){ 
        
        System.out.println("The float values that you entered are "+f.length);
        float value=0.0f;
        for(float  g:f){
            value+=g;
            
            System.out.print(" "+g);
            
            
        }
        System.out.println();
        System.out.println("The sum of the float values are "+value);
        
        
        
        System.out.println();
        System.out.println("***************************"); 
        System.out.println();
        System.out.println();
    }
}




public class varangs {
    public  static void main(String args[]) {
        
       
        add obj =new add();
        obj.addition(4,5,6,7,8,9,10);
        obj.ad('N','a','n','d','a');
        obj.addouble(3.9,7.8);
        obj.adstr("Nanda","Kumar");
        obj.adfloat(1.1f,4.7f);
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("The arrays in String format is "+Arrays.toString(arr));
    }
    
}