public class Factorial {
    public static int fact(int n){
        int result;
        if(n==0){
            return 1;
        }
         result = n * fact(n-1);

        return result;
    }


    public static void main(String[] args) {
       int m = fact(5);
       System.out.println(m);
    }
}
