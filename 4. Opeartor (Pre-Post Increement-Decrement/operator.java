import java.util.Scanner;



public class operator {
    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);


        System.out.println("Enter the first Number");
            double a = sc.nextDouble();

        System.out.println("Enter the Second Number");
            double b = sc.nextDouble();
   
         double c = a+b;
         double d = a-b;
         double e = a*b;
         double f = a/b;

        System.out.println("\nSum is : "+c+"\n Subtraction is " +d+ "\n Multiplication is "+e+"\n Division is  "+f);

            // Now i am Pre-incrementing both of the variable
            a=++a;
            b=++b;
        System.out.println("Now After Pre-incrementing\n"  + "The Value of your First Entered Value is : " +a  + "\nThe Value of your Second Entered Value is : " +b);

        
            // Now i am Post-incrementing both of the variable

            a=a++;
            b=b++;
            a=a;
            b=b;

        System.out.println("Now After Post incrementing\n"  + "The Value of your First Entered Value is : " +a  + "\nThe Value of your Second Entered Value is : " +b);

            // Now i am Post-decrementing both of the variable

            a=a--;
            b=b--;
            a=a;
            b=b;

        System.out.println("Now After Post-Decrementing\n"  + "The Value of your First Entered Value is : " +a  + "\nThe Value of your Second Entered Value is : " +b);



            // Now i am Pre-decrementing both of the variable
            a=--a;
            b=--b;
        System.out.println("Now After Pre-Decrementing\n"  + "The Value of your First Entered Value is : " +a  + "\nThe Value of your Second Entered Value is : " +b);

        
        
    }
}