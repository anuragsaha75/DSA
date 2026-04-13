
import java.util.*;

public class largest_of_two_number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Integer Number");
            int input_1 = sc.nextInt();
        System.out.println("Enter the Second Integer Number");
            int input_2 = sc.nextInt();

        if (input_1>input_2) {
            System.out.println( input_1 + " is the larger number");
                            }

        else if (input_2>input_1) {
            System.out.println( input_2 + " is the larger number");

                             }
        else {
            System.out.println("Both are same value");
            }
    }
}