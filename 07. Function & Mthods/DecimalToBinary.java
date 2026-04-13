public class DecimalToBinary {
    
    public static void DecToBi(int x){

    StringBuilder store_primary_binary = new StringBuilder();

        while(x>0) {

         int remainder = x % 2;
        //  System.out.print(remainder);
         store_primary_binary.append(remainder);
         x = x / 2 ;

        }

        
        store_primary_binary.reverse();
        System.out.println(store_primary_binary);

    }

    public static void main(String[] args) {
        DecToBi(34);
    }
}
