import java.util.*;


public class PrimeNumber {
    public static boolean is_prime (int num){

        

        if(num<=1){
            System.out.println("The number "+num+" is NOT prime");
            return false;
        }
        
        if(num==2){
            System.out.println("The number " +num + " is prime");
            return true;
        }
        for(int i=2 ; i<=num-1 ; i++){

            if (num%i==0) {
                System.out.println("The number " +num + " is NOT prime");
                return false;
            }
              
        }

        System.out.println("The number " +num + " is prime");
        return true;

       

    }

    public static void main(String[] args) {

        System.out.println("Please enter a nhumber");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        is_prime(num);

    }
}
