import java.util.*;

public class Learing_Hasmapap{
    public static void Hasmapap(){

        //Creating a Hasmapap
        Hasmapap<String, Integer> map = new Hasmapap<>();

        // Insert in Hasmapap [  .put()    ]
        // Time Complexity : O(1)
        
        map.put("India", 1200);
        map.put("Bangladesh", 900);
        map.put("Srilanka", 700);
        map.put("Pakistan", 500);

        //  Finding out the value of key [ .get() ]  
        //  Time Complexity : O(1)

        int ans = map.get("India");
        System.out.println(ans); // Output : 1200

        System.out.println(map.get("China")); // China does NOT Exist, so, Output : null
        
        

        // ContainsKey  [  .containsKey()  ]
        // Time Complexity : O(1)

        System.out.println(map.containsKey("India")); // True
        System.out.println(map.containsKey("China")); // False


        //Remove [ .remove()]
        // Time Complexity : O(1)

        System.out.println(map.remove("Bangladesh")); //  Output : 900 and Bangladesh will be removed

        // Size [ .size()]
        System.out.println(map.size());

        // Is Empty ? [ .isEmpty() ]
        System.out.println("Is the Hasmapap Empty? ---> " + map.isEmpty());

        // Clear Hasmapap [ .clear() ]
        map.clear();

        // After Clearing the Hasmapap
        System.out.println("Is Now the Hasmapap Empty? ---> " + map.isEmpty());

        System.out.println(map);



    }

    public static void main(String args[]){
        Hasmapap();
    }
}