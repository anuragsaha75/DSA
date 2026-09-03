/**
 * 0-1_Knapsack
 */

public class ZeroOneKnapsackUsingRecursion{

    public static int knapsack(int val[],int wt[], int W, int items_no) {
        if(W==0 || items_no==0){
            return 0;
        }

        if( wt[items_no-1] <= W ){ // Valid
            //include
            int ans1 = val[items_no-1] + knapsack(val, wt, W-wt[items_no-1], items_no-1);
            //exclude
            int ans2 = knapsack(val, wt, W, items_no-1);

            return Math.max(ans1, ans2);
        } 
        
        else{ // NOT Valid
            return knapsack(val, wt, W, items_no-1);
        }
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        int items_no = val.length;
        System.out.println(knapsack(val, wt, W, items_no));
    }
    
}