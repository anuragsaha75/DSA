import java.util.*;

public class BinaryToDecimal {
    public static int binaryTodecimal(int bi_num){

        int pow = 0 ;
            int number=0;
        while(bi_num>0) {
            int last_digit = (bi_num%10);
            number = number + last_digit*(int)Math.pow(2, pow);
            bi_num= (bi_num/10);
            pow++;
        }
        System.out.println(number);
        return number;

    }


    public static void main(String[] args) {
        System.out.println("Enter a Binary number");
         Scanner sc = new Scanner(System.in);
        int bi_num = sc.nextInt();
        binaryTodecimal(bi_num);

    }
}
