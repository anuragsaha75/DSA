public class UpdateIthBit {

    public static int updateIthBit(int number, int i, int newBit) {

        // Step 1: Clear the ith bit first
        // ~(1 << i) → ith bit becomes 0
        int bitMask = ~(1 << i);
        number = number & bitMask;

        // Step 2: Set ith bit according to newBit (0 or 1)
        // newBit << i → place newBit at ith position
        number = number | (newBit << i);

        return number;
    }

    public static void main(String[] args) {

        // Example:
        // number = 10 → 00001010
        // i = 1 → update 1st bit
        // newBit = 1 → set bit to 1

        System.out.println(updateIthBit(10, 1, 1)); // Output: 10
    }
} 
