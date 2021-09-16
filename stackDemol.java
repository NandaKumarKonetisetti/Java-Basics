import java.util.*;
 class Stack {
    int stack[] = new int[7];
    int top = 0;

    public void push(int data) {
        if(top == 7){
            System.out.println("Stack is Full");
            
        }else {
        stack[top] = data;
        top++;
        }

    } 
    public int   pop() { 
       
        int data = 0;
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }else{
        top--;
        data = stack[top];
        stack[top]=0;
        
        }
        return data; 
        
    }
    public int peek() {
        int data;
        data = stack[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public Boolean isEmpty() {
        return top<=0;
    }

    public void show() {
        for (int val :stack) {
            System.out.print(val + " ");
        }
    }

}

public class stackDemol {
    public static void main(String args[]) {
        Stack obj = new Stack(); 
        System.out.println(obj.isEmpty());
        
        obj.push(77);
        obj.push(76);
        obj.push(98);
        
        System.out.println("The size  is " +obj.size());
        
        obj.push(45);
        obj.push(43);
        obj.push(87);
        obj.push(56);
        obj.push(56);
        obj.push(56);
        obj.push(56);
        obj.push(56);
        
        
        System.out.println(obj.isEmpty());
        System.out.println("The peek value is "+obj.peek());
        // obj.pop();
        // obj.pop();
        // obj.pop();

        obj.show();
    }

}