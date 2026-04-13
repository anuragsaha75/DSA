import java.util.*;

public class CircleArea {
    public static void main(String args[]) {
        System.out.print("Enter the Radius of the Circle : ");
        Scanner sc= new Scanner (System.in);
        float rad = sc.nextFloat();
        double area = 3.14f * rad * rad;
        System.out.println("Area of Circle is :" + area); 
    }
}