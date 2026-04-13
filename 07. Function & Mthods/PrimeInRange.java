import java.util.*;

public class PrimeInRange {
    

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



    public static void prime_in_range (int MaxRange){
        for (int i=2;i<=MaxRange;i++ ){
            is_prime(i);
            if(is_prime(i)==true){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter the Max Range : ");
        Scanner sc = new Scanner(System.in);
        int MaxRange = sc.nextInt();
        prime_in_range(MaxRange);
    }


}
