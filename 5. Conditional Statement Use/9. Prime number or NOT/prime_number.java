
import java.util.*;


public class prime_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number you want to know If it is PRIME or NOT");
        int n = sc.nextInt();
        
        int i ; 
        boolean isPrime=true;

            for(i = 2 ; i <= (n-1); i++) {
                if ( (n % i)==0 ) {
                    isPrime=false;
                }
                
                else 
                {
                    isPrime=true;
                }
                break;
            }

            if (isPrime==true) {
                System.out.println(n+" is PRIME");
            }
            else if (isPrime==false){
                System.out.println(n+" is NOT PRIME");
            }
    }
}


