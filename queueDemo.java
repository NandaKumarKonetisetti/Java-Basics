import javax.print.attribute.standard.NumberOfInterveningJobs;

class Queue {
    int front;
    int rear;
    int size;
    int[] queue = new int[7];

    public void enqueue(int data) {
        if(!isFull()) {
        queue[rear] = data;
        rear = (rear + 1) % 7;
        size = size + 1;
        } else {
            System.out.println("Queue is Full");
        }

    }

    public int dequeue() {
        int data = queue[front];
        if(!isEmpty()) {
        front = (front + 1) % 7;
        size = size - 1;
        }else {
            System.out.println("Queue is Empty");
        }
        return data;

    }
    public int getSize(){
        return size;
    }
    public Boolean isEmpty(){
        return getSize() == 0;
    }
    public Boolean isFull() {
        return getSize() == 7;
    }

    public void show() {
        System.out.print(" The Elements of the queue are ");
        for (int i = 0; i < size; i++)
            System.out.print(queue[(front + i) % 7] + " ");
        System.out.println();
        System.out.println("Below one is Advanced for loop");
        for (int val : queue)
            System.out.print(val + " ");
    }

}

public class queueDemo {
    public static void main(String[] args) {
        Queue number = new Queue();
        System.out.println("to check whether the queue is empty or not "+number.isEmpty());
        number.enqueue(76);
        number.enqueue(75);
        number.enqueue(74);
        number.enqueue(73);
         
        // number.enqueue(72);
        // number.enqueue(67);

        number.dequeue();
        number.dequeue();

        number.enqueue(77);
        number.enqueue(71);
        number.enqueue(72);
        number.enqueue(63);
        number.enqueue(76);
        number.enqueue(76);
    

        
        System.out.println("to check whether the size of the queue is Full or not "+number.isFull());
        
        
        
        System.out.println("The size of the queue is "+number.getSize());
        number.show();
    }
}