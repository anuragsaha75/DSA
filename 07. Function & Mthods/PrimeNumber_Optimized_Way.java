import java.util.*;

public class PrimeNumber_Optimized_Way{

   public static boolean is_prime(int num){

        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(num);i++){
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        is_prime(num);

    }
}