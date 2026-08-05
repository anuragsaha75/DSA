//Qs

// Given n friends, each one can remain single or can be paired up with some other
// friend. Each friend can be paired only once. Find out the total number of ways in
// which friends can remain single or can be paired up.


public class TotalWaysOfPair {

    public static int TotalWays(int n){
        //Base Case
        if(n==1 || n==2){                  // 1. Way-1 : Stay Single
            return n;                      // 2. Way -2 : Pair Up
        }                                  // Total ways :  (Way-1 + Way-2) = 2 ways


        //In Case of Single
            int Singleways = TotalWays(n-1);
        //in case of Pair
            int waysIfPaired = (n-1)*TotalWays(n-2);

        // Total Ways
            int totways = Singleways + waysIfPaired;

        return totways;
    }


    public static void main(String[] args) {
        System.out.println(TotalWays(20));
    }
    
}