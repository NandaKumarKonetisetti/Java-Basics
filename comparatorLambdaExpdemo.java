import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorLambdaExpdemo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(404);
        li.add(503);
        li.add(208);
        li.add(907);
        li.add(706);
        li.add(909);  
        // // Normal code for sorting based on our logic.
        // Comparator<Integer> com = new Comparator<Integer>(){
        //                         public int compare(Integer x,Integer y){
        //                             // if(x%10>y%10)
        //                             // return 1;
        //                             // else 
        //                             // return -1;
        //                              return x % 10 > y % 10 ? 1 :-1;   // we can do the same thing in one line using ternary operator.
        //                         }
        // };
        // Using lambda expression in sorting for the above same code
        Comparator<Integer> com = ( x, y)-> x % 10 > y % 10 ? 1 :-1;  // in lambda expression no need to mention the type inside the paranthesis and also return statement is optional and also for one statement no need curly phrases so we can write the above code in a single line.
        // Here 1 will swap the elements and -1 won't swap the elements.
        // Comparator is a functional interface that's why we can use lambda Expression here
        // Remember Lambda Expression can be used only in the functional interface i.e in interface which has only one  abstract method.

        Collections.sort(li, com);
        for (Integer i : li)
            System.out.println(i);
        // for(int i=0; i<li.size();i++)
        // System.out.println(li.get(i));
    }

}