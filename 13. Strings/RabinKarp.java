public class RabinKarp {

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int base = 256;
        int prime = 101;

        int patternHash = 0;
        int textHash = 0;
        int h = 1;

        // h = base^(m-1) % prime
        for (int i = 0; i < m - 1; i++) {
            h = (h * base) % prime;
        }

        // Calculate hash of pattern and first window of text
        for (int i = 0; i < m; i++) {
            patternHash = (base * patternHash + pattern.charAt(i)) % prime;
            textHash = (base * textHash + text.charAt(i)) % prime;
        }

        // Slide the pattern over text
        for (int i = 0; i <= n - m; i++) {

            // If hash values match
            if (patternHash == textHash) {

                // Verify characters to avoid hash collision
                int j = 0;

                while (j < m &&
                       text.charAt(i + j) == pattern.charAt(j)) {
                    j++;
                }

                if (j == m) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Calculate hash for next window
            if (i < n - m) {

                textHash = (base * (textHash
                        - text.charAt(i) * h)
                        + text.charAt(i + m)) % prime;

                // Make hash positive
                if (textHash < 0) {
                    textHash += prime;
                }
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABCCDDAEFG";
        String pattern = "CDD";

        search(text, pattern);
    }
}