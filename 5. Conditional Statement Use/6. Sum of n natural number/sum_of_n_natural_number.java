import java.util.*;


public class sum_of_n_natural_number {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the value of n");

            long n = sc.nextLong();
            long sum = 0 ;

        for (long i=1 ; i<=n ; i++) {

            sum = sum + i ;

        }

        System.out.println("The sum of "+ n + " natural number is : " + sum);

        
    }
}