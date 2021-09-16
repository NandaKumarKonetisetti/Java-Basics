import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class collectionDemo {
    public static void main(String [] args) {
        Collection c = new ArrayList(); // It will support all the data types
        
        c.add(123); // The values present inside the add method are not normal objects(int num=7) they are wrapper class objects(Integer i = new Integer(7))
        c.add(456);
        // c.add(0);
        // c.add(1);
        // c.add(1.6f);
        // c.add(7.7);
        // c.add("n");
        c.add("nanda");
        c.add("kumar");
        c.add("oye");
        System.out.println(c);   // Here it will print in the form of collecton 
        Object objects[] = c.toArray();  // It us used to convert the collection in the form of an objects
        for(Object obj:objects){         // to convert the collection in the form of an array
            System.out.println("objects of the collection are  "+obj);

        }
        Iterator itr = c.iterator();  // In iterator interface name starts with capital "I" and method name starts with the smaall "i" as shown in this line 
        // System.out.println(itr.next());// it will print the value presernt at first.
        // System.out.println(itr.next()); // it will print the value present at second.
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next()); // Instead of printing eacj and every line we can easily do it by using the loop even if we don't knoe the size
        while(itr.hasNext()) 
        System.out.println(itr.next());
      
        
    }

}