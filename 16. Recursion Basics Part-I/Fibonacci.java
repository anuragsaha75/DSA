public class Fibonacci {
    public static int CalculateFibonacci(int n){

        int fibo_result;
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        //calculate nth term in fibonacci
        fibo_result = CalculateFibonacci(n-1) + CalculateFibonacci(n-2);
    
        return fibo_result;
        
    }
    public static void main(String[] args) {
        System.out.println(CalculateFibonacci(5));
    }
}
