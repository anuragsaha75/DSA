import java.util.*;
public class reverse_number {
    public static void main (String args[]) {

    System.out.println("Enter a number");

    Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        while (n>0) {

        
         int last_digit = n % 10 ;
         System.out.print(last_digit);
          n = n/10 ;
        }


    }
}

// Thanks