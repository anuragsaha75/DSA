import java.util.*;

public class CircleArea2 {
    public static void main (String args[]) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the Radius of the Circle");
        double radius= sc.nextDouble();

        double area= (22.0/7) * radius * radius ;
        System.out.println("The Area of the circle is "+ area);

    }

}