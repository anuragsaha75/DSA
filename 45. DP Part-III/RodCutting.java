

//                                 Rod Cutting
// Given a rod of length n inches and an array of prices that includes prices of all pieces of size smaller than n.
// Determine the maximum value obtainable by cutting up the rod and selling the pieces
        // int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        // int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        // int rodLength = 8;




public class RodCutting {

    public static int MaxProfitbyRodCut(int length[], int price[], int TotalrodLength){
        
        int n = price.length;
        int dp[][] = new int [n+1][TotalrodLength + 1];
        for(int i=0; i<price.length + 1; i++){
            dp[i][0]=0;
        }
        for(int j=0; j<price.length + 1; j++){
            dp[0][j]=0;
        }

        for(int i=1; i<dp.length;i++){
            for(int j=1; j<dp[0].length;j++){
                
                // VALID
                if(length[i-1]<=j){

                    int includeprofit = price[i-1]+dp[i][j-length[i-1]]; //Profit from the piece I just took + Profit from the remaining rod
                    
                    int excludeprofit =dp[i-1][j];
                    
                    dp[i][j] = Math.max(includeprofit,excludeprofit );
                }
                else{
                    //INVALID
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][TotalrodLength];
    }
    public static void main(String[] args) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int TotalrodLength = 8;
        System.out.println(MaxProfitbyRodCut(length, price, TotalrodLength));
    }
    
}
