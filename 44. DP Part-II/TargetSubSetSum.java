/**
 * TargetSubSetSum
 */
public class TargetSubSetSum {

    public static boolean TargetSumSubset(int arr[], int sum){
        int n= arr.length;
        boolean dp[][] = new boolean [n+1][sum +1]; // by default every [i][j] is false in java
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
        
        for(int i=1; i<n+1;i++){
            for(int j=1; j<sum+1;j++){
                //INCLUDE
                int v = arr[i-1]; // Bcz arr[] starts from zero but dp[i] we are filling from 1
                if(v <= j && dp[i-1][j-v]==true){ // numbers must be <= target sum && in upper cell(i-1) we have to if j-v is True or NOT
                    dp[i][j]=true;
                }

                //EXCLUDE
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
                
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int sum = 10;

        System.out.println(TargetSumSubset(arr, sum));
    }
}