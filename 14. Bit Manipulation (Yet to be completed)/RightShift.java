public class RightShift {
    public static void main(String[] args) {

        // Right Shift Operator (>>)
        // Syntax: x >> n
        // Meaning: shift bits of x to the right by n positions

        // Key Idea:
        // x >> n = x / (2^n)

        // Example:
        // 6 in binary = 00000110
        // 6 >> 1 → shift right by 1 position
        // Result = 00000011 (binary) = 3 (decimal)

        System.out.println(6 >> 1); // Output: 3

        // Explanation:
        // 6 / 2^1 = 6 / 2 = 3
    }
}