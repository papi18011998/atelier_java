import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class LesMaps {
   public static void main(String[] args) {
       Map<String,Integer> ages = new HashMap<>();
       ages.put("Papi", 24);
       ages.put("John", 24);
       
       for (Entry<String,Integer> age: ages.entrySet()) {
                System.out.println(age.getKey());   
       }
   } 
}
