import java.util.Iterator;
import java.util.ArrayList;

import java.util.List;
public class listTypeSafeDemo {
    public static void main(String [] args) {
        List<Integer> li = new ArrayList();
        li.add(2);
        li.add(7);
        li.add(0,5);
        System.out.println("Using normal for loop");
        System.out.println();
        for(int i=0; i<li.size();i++)
        System.out.println(li.get(i));
        System.out.println();
        System.out.println("Using Advanced for loop");
        System.out.println();
        for(Integer i: li) 
        System.out.println(i);
    }
    
}