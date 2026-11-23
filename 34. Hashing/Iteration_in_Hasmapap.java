import java.util.*;

public class Iteration_in_Hasmapap {


    public static void Hasmapap_Iteration(){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Indonesia", 6);
        map.put("Nepal", 5);


        // Creating a Set of the Keys from HashMap
        Set<String> keys = map.keySet(); 

        // Iterating the Set (key, value)
        for(String str : keys){
            System.out.println("Key = "+str + ", Value =" + map.get(str));
        }

        // Usage of entrySet()
        System.out.println(map.entrySet()); // This returns all the key value pair

        
    }


    public static void main(String[] args) {
        Hasmapap_Iteration();
    }
}
