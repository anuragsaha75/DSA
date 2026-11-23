import java.util.Arrays;

        //   LONGEST COMMON SUBSEQUENCE

public class LCS{

    //    WITH RECURSION
    public static int LCS_Recursion(int m, int n, String a, String b){

        if(m==0 || n==0){
            return 0;
        }

        if(a.charAt(m-1)==b.charAt(n-1)){
            return 1+LCS_Recursion(m-1, n-1, a, b);
        } else{
            return Math.max( LCS_Recursion(m-1, n, a, b) , LCS_Recursion(m, n-1, a, b) );
        }
    }







    // WITH MEMOIZATION

    public static int LCS_Memoization(String a, String b) {

        int m = a.length();
        int n = b.length();

        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return LCS_Memoization_UTIL(m, n, a, b, dp);
    }

    public static int LCS_Memoization_UTIL(int m, int n, String a, String b, int dp[][]) {

        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return dp[m][n] = 1 + LCS_Memoization_UTIL(m - 1, n - 1, a, b, dp);
        } else {
            return dp[m][n] = Math.max(
                LCS_Memoization_UTIL(m - 1, n, a, b, dp),
                LCS_Memoization_UTIL(m, n - 1, a, b, dp)
            );
        }
    }






    // WITH TABULATION
    public static int LCS_Tabulation(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        int m = a.length();
        int n = b.length();

        int dp[][] = new int [m+1][n+1];

        for(int i=0; i<=m; i++){
            dp[i][0]=0;
        }
        for(int j=0; j<=n; j++){
            dp[0][j]=0;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);

                }
            }
        }

        return dp[m][n];
    }



    public static void main(String[] args) {
        String a = "ABCAB";
        String b = "AECB";
        int m = a.length();
        int n = b.length();

        // System.out.println(LCS_Recursion(m, n, a, b));
        System.out.println(LCS_Tabulation(a, b));
        
        
    }
}