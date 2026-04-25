
// QUESTION 3: 
// You are given an array prices where prices[i] is the price of a given stock 
// on the ith day. 
// Return the maximum profit you can achieve from this transaction. If you cannot 
// achieve any profit, return 0. 
// Example 1: 
// Input: 
// prices = [7, 1, 5, 3, 6, 4] 
// Output:  5 
// Explanation: 
// Example 2: 
// Input: 
// Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 
// 5. Note that buying on day 2 and selling on day 1 is not allowed 
// because you must buy before you sell. 
// Prices = [7, 6, 4, 3, 1] 
// Output:  0 
// Explanation: 
// Constraints: 
// In this case, no transactions are done and the max profit = 0.


public class Question3 {


    public static int BestTimeToMaxProfitForBuyAndSellStock(int arr[]){
        int buy=arr[0];
        int Maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<buy){
                buy=arr[i];
            }else{
                int profit=arr[i]-buy;
                Maxprofit=Integer.max(Maxprofit,profit);
            }
        }
        return Maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7, 6, 4, 3, 1};
        System.out.println(BestTimeToMaxProfitForBuyAndSellStock(arr));
    }
}
