//Qs.

//Count ways to reach the n'th stair. The person can climb either 1 stair or 2 stairs at a time.

import java.util.*;
public class Climbing_Stairs {
    //  Using Tabulation
    public static int TotalWaysOfClimbingStairs(int n){
        //Base Case 
        int dp[] = new int[n+1]; // bcz we will find out solution till n
        dp[0] = 1;
        dp[1] = 1; 

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];


    }

    //Using Memoization

    public static int TotalWaysOfClimbingStairs2(int n, int dp[]) {

        // BASE CASE
            if(n==0){
                return 1;
            }else if(n<0){
                return 0;
            }
        // Checking if already stored
            if(dp[n]!=-1){       // bcz in the main function The Array is initialised by default it is [-1, -1, -1, -1, ....] in the array
                return dp[n];
            } 
            //if NOT stored then store
            dp[n] = TotalWaysOfClimbingStairs2(n-1,dp) + TotalWaysOfClimbingStairs2(n-2,dp);
        

        return dp[n];

    }
    public static void main(String[] args) {
        int n=5;
        int arr[] = new int[n+1]; 
        Arrays.fill(arr, -1);

        System.out.println(TotalWaysOfClimbingStairs2(n, arr));
    }
}
