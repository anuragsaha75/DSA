
import java.util.*;
public class DecToBin {
    
    public static void DecimalToBinary(int x){

        StringBuilder sc = new StringBuilder();

       
        while(x>0) {
           
            int remainder = x % 2;
            sc.append(remainder);
            x = x / 2 ;
        }

        sc.reverse();

        System.out.println(sc);
        

    }

    public static void main(String[] args) {

        System.out.println("Please Enter a Number that you want to convert to String");
        
        Scanner ab = new Scanner(System.in);
        int x = ab.nextInt();

         DecimalToBinary(x);


    }
}
