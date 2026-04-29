public class GetIthBit {

    public static int getIthBit(int number, int i) {

        // Step 1: Create Bit Mask
        // (1 << i) means shift 1 to left by i positions
        // Example: i = 4 → 00010000
        int BitMask = (1 << i);

        // Step 2: Perform AND operation
        // number & BitMask checks whether the ith bit is 0 or 1

        // If result = 0 → ith bit is 0
        if ((number & BitMask) == 0) {
            return 0;
        }

        // If result ≠ 0 → ith bit is 1
        return 1;
    }

    public static void main(String[] args) {

        // Example:
        // number = 10 → binary = 00001010
        // i = 4 → checking 4th bit (from right, 0-based index)

        System.out.println(getIthBit(10, 4)); // Output: 0
    }
}