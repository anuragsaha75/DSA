import java.util.Scanner;

public class Input_Output_array {

    public static void main(String[] args) {

        int[] marks = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter physics marks: ");
        marks[0] = sc.nextInt();

        System.out.print("Enter chemistry marks: ");
        marks[1] = sc.nextInt();

        System.out.print("Enter math marks: ");
        marks[2] = sc.nextInt();

        // To update the value of the array ---
          
        marks[0] = marks[0] + 1;  // Force fully Updating the Value

        System.out.println("Physics Marks has been increased by one mark, Now phy marks is : " + marks[0]);

        int sum = marks[0] + marks[1] + marks[2];
        System.out.println("Total marks = " + sum);
        
    }
    
    

}
