public class SumFirstNnaturalNumber {
    public static int SumNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        int result = n + SumNaturalNumber(n-1);

        return result;
    }
    public static void main(String[] args) {
        System.out.println(SumNaturalNumber(9));
    }
}
