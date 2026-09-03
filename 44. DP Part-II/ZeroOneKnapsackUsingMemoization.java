/**
 * 0-1_Knapsack
 */

public class ZeroOneKnapsackUsingMemoization{

    public static int knapsack(int val[],int wt[], int W, int items_no, int dp[][]) {
        if(W==0 || items_no==0){
            return 0;
        }

        if(dp[items_no][W]!=-1){
            return dp[items_no][W];
        }

        if( wt[items_no-1] <= W ){ // Valid
            //include
            int ans1 = val[items_no-1] + knapsack(val, wt, W-wt[items_no-1], items_no-1, dp);
            //exclude
            int ans2 = knapsack(val, wt, W, items_no-1, dp);

            dp[items_no][W] = Math.max(ans1, ans2);
             return dp[items_no][W];
        } 
        
        else{ // NOT Valid
            dp[items_no][W]= knapsack(val, wt, W, items_no-1, dp);
            return dp[items_no][W];
        }
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] = new int [val.length+1][W+1];
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    dp[i][j]=-1;
                }
            }
        int items_no = val.length;
        System.out.println(knapsack(val, wt, W, items_no,dp));
    }
    
}