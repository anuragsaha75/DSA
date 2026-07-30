public class XtoThePowerN_Optimized {
    public static int XpowerN_Optimized(int power ,int number){

        //Base Case
        if(power==1){
            return number;
        }
        if(power == 0){
            return 1;
        }

        // In Case of Power is Even
        
        // int result =  XpowerN_Optimized(power/2, number) * XpowerN_Optimized(power/2, number);
        
        int halfPower_result = XpowerN_Optimized(power/2, number);

        int result = (halfPower_result * halfPower_result);

        //In Case of Power is Odd
        if( power % 2 !=0 ){
            return result = (number * halfPower_result * halfPower_result);
        }

        
        return  result;
    }


    public static void main(String[] args) {
        int r = XpowerN_Optimized(5, 2);
        System.out.println(r);
    }
}
