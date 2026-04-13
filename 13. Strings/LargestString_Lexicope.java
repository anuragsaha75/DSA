
// Largest String Lexicographically


public class LargestString_Lexicope {

    public static String Largest_String(String arr[]){
        String largest=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(largest.compareTo(arr[i])<0){  // "compareTo" function use
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        String fruits[] = {"apple", "mango","banana"};
        System.out.println(Largest_String(fruits));
    }
}





// compareTo() method in Java is used to compare two strings lexicographically
// (i.e., dictionary order) based on their Unicode/ASCII values.
// Syntax: str1.compareTo(str2)

// If the result is 0  → both strings are equal.
// If the result is <0 → str1 comes before str2.
// If the result is >0 → str1 comes after str2.

// Example:
// String s1 = "apple";
// String s2 = "banana";

// System.out.println(s1.compareTo(s2)); 
// Output will be negative because "apple" comes before "banana".


// compareToIgnoreCase() works the same way as compareTo()
// but it ignores uppercase and lowercase differences.

// Syntax: str1.compareToIgnoreCase(str2)

// Example:
// String a = "Java";
// String b = "java";

// System.out.println(a.compareTo(b));           
// Not equal because 'J' and 'j' have different ASCII values.

// System.out.println(a.compareToIgnoreCase(b)); 
// Output: 0 because case differences are ignored.


// Quick summary:
// compareTo() → compares strings with case sensitivity.
// compareToIgnoreCase() → compares strings ignoring case differences.
// Return value rule:
// 0  → equal
// <0 → first string is smaller
// >0 → first string is greater