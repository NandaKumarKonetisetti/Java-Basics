import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String [] args) {
        Set<Integer> st = new TreeSet<>(); // if we use tree set we can get the numbers in the ascending order. 
        // Set<Integer> st = new HashSet<>(); We can use hashset or tree set if we use hashset we can get random numbers 
        st.add(97); // /set contains only unique elements it won't take duplicate elements
        st.add(39);
        System.out.println(st.add(420)); //Here the element is added so it will return true
        System.out.println(st.add(460)); // Here the elemnent is not added so it will return false this means it contains only unique elemnents so duplicate values were not added in that
        System.out.println(st.add(960));  // If the element is added in the list then it will return true else it will return false
        for(Integer i:st)
        System.out.println(i);
    }
    
}