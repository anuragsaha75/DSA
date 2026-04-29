public class ClearIthBit {

    public static int clearIthBit(int number, int i) {

        // Step 1: Create Bit Mask
        // (1 << i) → ith bit = 1
        // ~(1 << i) → ith bit = 0, rest = 1
        int bitMask = ~(1 << i);

        // Step 2: Use AND operation
        // AND with 0 → clears that bit
        // AND with 1 → keeps bit unchanged
        number = number & bitMask;

        return number;
    }

    public static void main(String[] args) {

        // Example:
        // number = 10 → 00001010
        // i = 1 → clear 1st bit

        System.out.println(clearIthBit(10, 1)); // Output: 8
    }
}