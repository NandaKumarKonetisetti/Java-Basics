import java.util.LinkedList;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;

        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }
    }
    public void deleteAt(int index){
        if ( index == 0) {
            head = head.next;
        }
        else {
            Node n = head;
            Node n1 = null;
            for ( int i =0 ; i<index-1;i++){
                n=n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            //System.out.println("n1 "+n1.data);
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

public class linkedListDemo {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insert(77);
        li.insert(43);
        li.insert(34);
        li.insertAtStart(7);
        li.insertAt(3, 75);
        li.deleteAt(2);
        
        li.show();

    }

}