public class CheckEvenOddBitwiseOperator{
    public static void main(String[] args) {
        int num = 7;
        int BitMask=1;
        // Bitwise AND (&) is used to compare bits
        // num & 1 checks the last bit (LSB - Least Significant Bit)

        // Binary:
        // 7 = 00000111
        // 1 = 00000001

        // Operation:
        //   00000111
        // & 00000001
        // ----------
        //   00000001 → result = 1

        // Logic:
        // If last bit(Least Significant Bit [LSB]) = 0 → Even number
        // If last bit(Least Significant Bit [LSB]) = 1 → Odd number

        if ((num & BitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Why it works:
        // Even numbers always end with 0 in binary
        // Odd numbers always end with 1 in binary
    }
}



