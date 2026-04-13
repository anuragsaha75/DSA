
import java.util.*;
public class calculator {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the first Number\n");
            double input_1 = sc.nextDouble();

        System.out.println("Enter the another Number\n");
            double input_2 = sc.nextDouble();

        System.out.println("Enter the Operator");
          char Operator= sc.next().charAt(0);

        switch ( Operator) {

                case '+' : System.out.println(input_1+input_2);
                        break;
                case '-' : System.out.println(input_1-input_2);
                        break;
                case '*' : System.out.println(input_1*input_2);
                         break;
                case '/' : System.out.println(input_1/input_2);
                         break;
                default:System.out.println("This operation is not valid");
        }


    }
}