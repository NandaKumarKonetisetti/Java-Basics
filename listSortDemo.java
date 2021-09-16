import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class mycomparator implements Comparator<Integer> {
    public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10)
            return 1;
        else
            return -1;
    }

}

public class listSortDemo {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        li.add(509);
        li.add(605);
        li.add(398);
        li.add(784);
        li.add(276);
        li.add(147);
        System.out.println("Maximum value in the list is "+Collections.max(li));
        System.out.println("Minimum value in the list is "+Collections.min(li));
        // Colections.sort(li);// to sort the elemnts in ascending order
        // Collections.shuffle(li); // to shuffle the elements
        // Collections.reverse(li); // to reverse the elements
        
            Comparator com= new mycomparator();
        
            //Collections.sort(li,new mycomparator()); // we can pass the elements by passing the object directly inside the sort method.
        Collections.sort(li, com); // To sort the elemnts based on our logic

        for (Object obj : li)
            System.out.println(obj);
    }

}