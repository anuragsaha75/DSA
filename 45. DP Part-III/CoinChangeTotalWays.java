public class CoinChangeTotalWays {

    public static int ToyalWaysofCoinChange(int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int [n+1][sum+1];

        for(int i=0; i<dp.length;i++){
            dp[i][0] = 1;
        }
        for(int j=1;j<dp[0].length;j++){
            dp[0][j]=0;
        }

        for(int i=1; i<=coins.length;i++){
            for(int j=1;j<=sum;j++){
                if(coins[i-1]<=j){
                    int Ways_of_include = dp[i][j-coins[i-1]];
                    int Ways_of_exclude = dp[i-1][j];
                    int totalways = Ways_of_include + Ways_of_exclude;
                    dp[i][j] = totalways;
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
                
            }
        }
        return dp[n][sum];
    }


    public static void main(String[] args) {
        int coins [] = { 2, 5, 3, 6 };
        int sum = 10 ;
        System.out.println(ToyalWaysofCoinChange(coins, sum));
    }
}
