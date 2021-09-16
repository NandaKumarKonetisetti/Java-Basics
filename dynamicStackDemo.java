class Stack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data) {
        if (size() == capacity)
            expand();

        stack[top] = data;
        top++;

    }

    private void expand() {
        int length = size();
        int[] newstack = new int[capacity * 2];
        System.arraycopy(stack, 0, newstack, 0, length);
        stack = newstack;
        capacity*=2;
    }

    public int pop() {

        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            shrink();

        }
        return data;

    }
    private void shrink(){
        int length = size();
        if(length<=(capacity/2)/2) {
            capacity/=2;
            int newstack[] = new int[capacity];
            System.arraycopy(stack, 0, newstack, 0, length);
            stack = newstack;
        }
    }

    public int peek() {
        int data;
        data = stack[top - 1];
        return data;
    }

    public int size() {
        return top;
    }

    public Boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for (int val : stack) {
            System.out.print(val + " ");
        }System.out.println();
    }

}

public class dynamicStackDemo {
    public static void main(String args[]) {
        Stack obj = new Stack();
        System.out.println(obj.isEmpty());

        obj.push(77);
        obj.push(76);
        obj.push(98);
        

        
        obj.push(45);
        obj.push(43);
        obj.push(43);
       
        obj.push(43);
        obj.push(43);
        obj.push(87);
    
        obj.show();


        obj.pop();
        obj.pop();
        obj.show();
        obj.pop();
        obj.pop();
        obj.pop();
    
        obj.show();
      
        
        System.out.println(obj.isEmpty());
        System.out.println("The peek value is " + obj.peek());
       
        
        System.out.println("The size  is " + obj.size());

        obj.show();
    }

}