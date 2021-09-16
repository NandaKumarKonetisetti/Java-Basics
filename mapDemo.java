import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class mapDemo {
    public static void main(String [] args){
        Map<String,String> map =  new HashMap<>();
        map.put("Name","John");
        map.put("Actress","pinky");// we can repeat values 
        map.put("actor", "john"); // we cannot repeat keys because if we repeat it will replace the old value with the latest value.
        map.put("Actress","pinky");
        System.out.println(map);
        System.out.println(map.get("Name"));

        Set<String> keys =  map.keySet();
        for(String key:keys)
        System.out.println(key +" "+map.get(key));
    }
    
}