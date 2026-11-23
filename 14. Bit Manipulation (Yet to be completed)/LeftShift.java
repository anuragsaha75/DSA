public class LeftShift {
    public static void main(String[] args) {

        // Left Shift Operator (<<)
        // Syntax: x << n
        // Meaning: shift bits of x to the left by n positions

        // Key Idea:
        // x << n = x * (2^n)

        // Example:
        // 5 in binary = 00000101
        // 5 << 2 → shift left by 2 positions
        // Result = 00010100 (binary) = 20 (decimal)

        System.out.println(5 << 2); // Output: 20

        // Explanation:
        // 5 * 2^2 = 5 * 4 = 20
    }
}