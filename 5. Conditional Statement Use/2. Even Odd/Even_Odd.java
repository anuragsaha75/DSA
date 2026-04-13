import java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number you want to check if it is EVEN or ODD");

        int input= sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("The number is Even");
                }
        else {
            System.out.println("The number is Odd");
            }
    }
}