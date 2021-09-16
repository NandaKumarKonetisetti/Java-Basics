import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listDemo {
    public static void main(String [] args) {
        List li = new ArrayList();   // lisst contain duplicate Elements and also it will take index value and object value too 

    li.add(1);
    li.add(8);
    li.add(6);
    
    li.add(1,7);  // it will assign the value 7 at the index 1
    // Iterator itr = li.iterator();   // we can use iterator for printing the values but we are not familiar withit that's why we can use for or advanced for loop to print the values in the iterator.
    // while(itr.hasNext())
    // System.out.println(itr.next());
    for(int i=0;i<li.size();i++)   // Norml for loop to retrieve  the values
    System.out.println(li.get(i));
    
    for(Object i :li)
    System.out.println(i);          // Advanced for loop to retrieve the values.
    }
    
}