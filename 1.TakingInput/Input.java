import java.util.*;
public class Input {
    public static void main (String args[]) {

        //Taking Name and Age
        System.out.println("We need Your Name and Age");
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner (System.in);
         String name =  sc.nextLine();
        System.out.println("Enter Your Age"); 
         int age = sc.nextInt();
        System.out.print( "Your Name is" + " " + name + " " +"and" +" " + age +" " + "is your age" );

        //Taking Education Details
        System.out.println("We need Your Education Details");
        System.out.println("Enter Your 10th Percentage");
            float score_10th = sc.nextFloat();
        System.out.println("Enter Your 12th Percentage");
            float score_12th = sc.nextFloat();  
        System.out.println("Enter Your Graduation Obtained CGPA");
            float score_graduation = sc.nextFloat();

        System.out.println("Your 10th percentage is "+score_10th+" \n"+"Your 12th percentage is "+score_12th+" \n"
        + "and Your Graduation CGPA is "+ score_graduation); 


            }

}
    
