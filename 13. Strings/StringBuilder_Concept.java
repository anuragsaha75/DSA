public class StringBuilder_Concept {
    public static void main(String[] args) {

        /*
        =====================================================
        STRING vs STRINGBUILDER
        =====================================================

        String objects in Java are IMMUTABLE.

        Immutable means:
        Once a String object is created, its value cannot be changed.

        Example:
        String str = "Hello";
        str = str + " World";

        Here Java does NOT modify the original string.
        Instead it creates a NEW object in memory.

        This causes:
        - Extra memory usage
        - Slower performance when many modifications happen.

        To solve this problem Java provides:
        StringBuilder
        */

        /*
        =====================================================
        WHAT IS STRINGBUILDER?
        =====================================================

        StringBuilder is a mutable sequence of characters.

        Mutable means:
        The same object can be modified without creating
        a new object every time.

        Therefore StringBuilder is MUCH faster when
        repeatedly modifying strings.
        */

        /*
        Syntax:
        StringBuilder sb = new StringBuilder("Hello");
        */

        StringBuilder sb = new StringBuilder("");

        /*
        =====================================================
        WHAT DOES append() DO?
        =====================================================

        append() adds characters or strings to the
        existing StringBuilder object.

        Unlike String concatenation,
        it does NOT create a new object.

        It modifies the SAME object.

        Example:
        sb.append("A");

        If sb was ""
        after append it becomes "A"
        */


        /*
        =====================================================
        EXAMPLE: APPENDING a-z
        =====================================================

        We are appending characters from 'a' to 'z'.

        Instead of creating 26 different String objects,
        StringBuilder modifies the same object.

        This is memory efficient and faster.
        */

        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);                         //Time Compexity : O(26)
        }                                          // If we used 'sb=sb+ch' then Time Complexity would be O(26*n^2)

        /*
        Now sb contains:
        abcdefghijklmnopqrstuvwxyz
        */

        System.out.println(sb+"");


        /*
        =====================================================
        WHERE STRINGBUILDER IS USED
        =====================================================

        StringBuilder is used when:

        1. Many string modifications are required
        2. Loop-based concatenation
        3. Competitive programming
        4. Large text building

        Example:
        - Generating alphabets
        - Building long strings
        - Parsing text
        */


        /*
        =====================================================
        WHERE STRINGBUILDER IS NOT USED
        =====================================================

        If the string is constant and not modified,
        use normal String.

        Example:
        String name = "Anurag";

        Because String is safer and simpler.
        */


        /*
        =====================================================
        STRINGBUILDER IMPORTANT METHODS
        =====================================================

        append()   → add data
        insert()   → insert at index
        delete()   → delete characters
        reverse()  → reverse the string
        length()   → length of string
        charAt()   → get character
        setCharAt()→ replace character
        */


        /*
        =====================================================
        CONVERT STRINGBUILDER TO STRING
        =====================================================

        String str = sb.toString();

        toString() converts StringBuilder
        into a normal String.
        */
    }
}