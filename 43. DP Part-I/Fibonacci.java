/**
 * Fibonacci with Memoization (Dynamic Programming)
 */
public class Fibonacci {

    public static int fib(int n, int arr[]){
        //Base Case 
        if(n==0 || n==1){
            return n;
        }

        //check if the value is already calculated and stored in the array
        if(arr[n]!=0){
            return arr[n];
        }

        // In Case the value is NOT calculated , then calculate and store
        arr[n] = fib(n-1, arr) + fib(n-2, arr);

        return arr[n];
    }

    public static void main(String[] args) {
        int n =5;
        int arr[] = new int [n+1]; // by default [0, 0, 0, 0 ..]
        int result = fib(n, arr);
        System.out.println(result);
    }
}