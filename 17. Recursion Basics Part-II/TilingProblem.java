

// Given a "2 x n" board and tiles of size "2 x 1", count the number of
// ways to tile the given board using the 2 x 1 tiles.
// (A tile can either be placed horizontally or vertically. 




public class TilingProblem {



    public static int TilingTotalWays(int n){  // n is width . 2 is height . thats  why (2 x n) 
        // Base Case
        if(n==0 || n==1){
            return 1 ;  // Because 1 ta tile bosaleu ways 1 abar kichu na bosaleo mane 0 holeo ways 1 .
        }
        //Kaam

            // If Placed Vertically

                // f(n-1) = 2 x (n-1)
                int f_minus_1 = TilingTotalWays(n-1);

            // If Placed Horizontally 

                // f(n-2) = 2 x (n-2)
                int f_minus_2 = TilingTotalWays(n-2);

            // So, The Total Ways
            int totalways = f_minus_1 + f_minus_2;

        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(TilingTotalWays(4));
    }
}
