import java.util.*;

public class Find_Prime {
    
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        if(num==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
           if (num%i==0) {
            return false;
           }
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if (isPrime(num)==true) {
            System.out.println("The number "+num+" is Prime");
        }
        else { 
            System.out.println("The number "+num+" is NOT Prime");
        }
        
    }
}
