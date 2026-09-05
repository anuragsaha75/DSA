public class ZeroOneKnapsackTabulation {
    public static int ZOknapsackTabulation(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int [n+1][W+1]; // n+1 and W+1 beacuse 0th column wise and 0th row wise will be filled with 0 in the next

        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;       // Fillling all rows in 0th column with 0
        }
        for(int j=0; j<dp[0].length; j++){
            dp[0][j]=0;         // Fillling all columns in 0th row with 0
        }

        for(int i=1; i<n+1;i++){

            for(int j=1;j<W+1;j++){

                int value = val[i-1]; // i'th item value
                int weight = wt[i-1]; // i'th item weight

                if(weight<=j){ // VALID Condition
                    int includeProfit = value + dp[i-1][j-weight];
                    int excludeProfit = dp[i-1][W];
                    dp[i][j] = Math.max(includeProfit, excludeProfit);

                } else{ // INAVLID Condition
                    int excludeProfit = dp[i-1][W];

                    dp[i][j] = excludeProfit;
                }
            }
        }

        print(dp);

        return dp[n][W]; // dp[n][W] means the last cell of the 2D array
    }






    // This Function is just to print the dp[][] to visualise. No direct connection with this problem
    public static void print(int dp[][]){

        for( int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                System.out.print(dp[i][j]+" ") ;
            }
        System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println(ZOknapsackTabulation(val, wt, W));
        
    }
}
