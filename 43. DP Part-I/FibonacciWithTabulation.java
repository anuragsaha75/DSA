

// Calculating n'th fibonacci using Tabulation(Dynamic Programming)







public class FibonacciWithTabulation {


    public static int FiboTabulation(int n){
        
        //Initialization
        int dp[]= new int [n+1];
        dp[0] = 0;
        dp[1] = 1;

        //filling small to large
        for(int i=2;i<=n;i++){     // i=2 because 0 and 1 is already there . for n==0 || n==1 it is n only
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        int result = dp[n];

        return result;
        
    }


    public static void main(String[] args) {
        System.out.println(FiboTabulation(7));
    }
}
