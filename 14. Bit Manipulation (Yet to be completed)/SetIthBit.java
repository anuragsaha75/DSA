public class SetIthBit {

    public static int setIthBit(int number, int i) {

        // Step 1: Create Bit Mask
        // (1 << i) → only ith bit is 1, rest are 0
        int bitMask = (1 << i);

        // Step 2: Use OR operation
        // OR with 1 → sets that bit to 1
        number = number | bitMask;

        return number;
    }

    public static void main(String[] args) {

        // Example:
        // number = 10 → 00001010
        // i = 2 → set 2nd bit

        System.out.println(setIthBit(10, 2)); // Output: 14
    }
}