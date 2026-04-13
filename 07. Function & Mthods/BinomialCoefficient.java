
import java.util.*;


public class BinomialCoefficient{

    public static int binomial_coefficient(int n, int r){

        int fact_n=1;
        for(int i=1; i<=n; i++) {   //factorial of n
            fact_n = fact_n* i ;
        } 

        int fact_r = 1;
        for(int i=1; i<=r; i++) {   //factorial of r
            fact_r = fact_r* i ;
        }

        int diff_n_minus_r = (n-r);
        int fact_n_minus_r = 1;
        for(int i=1; i<=diff_n_minus_r ; i++) {      // factorial of n-r
            fact_n_minus_r= fact_n_minus_r*i;
        }

        return fact_n/(fact_r*fact_n_minus_r);


    }


    public static void main(String[] args) {

        int n;
        int r;
        System.out.println("Enter the n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the r");
        r = sc.nextInt();

       int  result = binomial_coefficient(n, r);

       System.out.println("The Binomial Coefficient is : " + result);

        
    }

}