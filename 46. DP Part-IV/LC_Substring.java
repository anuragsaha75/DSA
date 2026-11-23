/**
 * Longest Common Substring
 */
public class LC_Substring {

    public static int LongestCommonSubstring(String str1, String str2){
        int m = str1.length();
        int n = str2.length();
        int ans = 0;
        int dp[][] = new int [n+1][m+1];
            
        for(int i=0; i<=m; i++){
                dp[i][0] = 0;
        }

        for(int j=0;j<=n;j++){
                dp[0][j]=0;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                        dp[i][j] = 1 + dp[i-1][j-1];

                        ans = Math.max(ans, dp[i][j]);  // Comparing because of storing the maximum substring length
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        
        return ans;
    }



    public static void main(String[] args) {
        String a = "ABCDE";
        String b = "ABGCE";
        System.out.println(LongestCommonSubstring(a, b));
    }
    
}