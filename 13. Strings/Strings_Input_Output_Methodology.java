
import java.util.*;

// String is IMMUTABLE
public class Strings_Input_Output_Methodology {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        // String s = sc.next(); // It will print only the first word,
                                                            // NOT Entire Line
        // System.out.println("The entered String is : "+s); 
        String s1 = sc.nextLine(); // It will print the Entire LINE

        System.out.println("The Entered String is : "+s1);  
    }
}
