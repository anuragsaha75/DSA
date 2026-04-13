
import java.util.*;


public class reverse_the_whole_number {
    public static void main(String[] args) {

        System.out.println("Enter the number you want to Reverse");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int reverse= 0;

        do {
            int last_digit = n % 10;
            reverse = (reverse * 10 )+ last_digit;
            n = n/10;
            } while( n > 0);

        System.out.println(reverse);

    }
}