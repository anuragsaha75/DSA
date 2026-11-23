public class UnboundedKnapsack {

    public static int UBKnapsack(int val[], int wt[], int W){
        int n = wt.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=0;                  // All row is zero at j=0th
        }

        for(int j=0; j<dp[0].length;j++){   // All column is zero at i=0th
            dp[0][j]=0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1; j<dp[0].length; j++){
                
                if(wt[i-1]<=j){ // Valid

                    int includeProfit = val[i-1] + dp[i][j-wt[i-1]]; // Valid  +  Include
                    int excludeProfit = dp[i-1][j]; // Valid  +  Exclude

                    dp[i][j] = Math.max(includeProfit, excludeProfit);
                } 
                else{ // INVALID
                    dp[i][j] = dp[i-1][j]; // Invalid  +  Exclude
                }
            }    
        }
        return dp[n][W];
    }



    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(UBKnapsack(val, wt, W));
    }
}
