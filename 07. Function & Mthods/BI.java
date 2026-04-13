public class BI {
    public static int biToDeci(int bi_num){

        int num=0;
        int pow=0;
        while(bi_num>0) {
            
            int last_digit = bi_num %10;
            num = num + (last_digit*(int)Math.pow(2, pow));
            bi_num = bi_num/10;
            pow++;

        }
        return num;

    }


    public static void main(String[] args) {
        int bi_num=10101010;
        System.out.println(biToDeci(bi_num));
    }
}
