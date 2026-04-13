import java.util.*;
public class IncomeTaxCalculator {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the salary in LPA ");
        double input = sc.nextDouble();

        if (input <  5.0 ){
            System.out.println("No Tax !! No Need To Pay Tax");
            }
        else if (5.0 < input && input < 10.0) {

            input = input*(20.0/100.0);
             System.out.println(" 20 % Tax !! You have to pay 20% tax of your income . Your Tax amount is "+input+ "LPA");
            }
        else {
            input = input*(30.0/100.0);
            System.out.println("30% Tax !! You have to pay 30% tax of your income .Your Tax amount is "+input+ "LPA");
        }
    }
}