import java.util.*;
public class leapyear {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the year \n");
            double input = sc.nextDouble();

        if (((input % 4 == 0) && (input % 100 != 0) ) || (input % 400 == 0))  {
            System.out.println(input+" is a Leap-year");
            }
        else {
            System.out.println(input+" is NOT a Leapyear");
        }
    }
}