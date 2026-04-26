
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        String str1 ="listen";
        String str2 ="silent";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!=str2.length()){
            System.out.println("NOT Anagram");
        }

        char arr1[]=new char[str1.length()];
        char arr2[]=new char[str2.length()];
        arr1=str1.toCharArray();
        arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){                      // NOTE:
                                        // Do NOT use arr1.equals(arr2) for comparing arrays.
                                        // equals() checks memory reference, not actual content.

                                        // Use Arrays.equals(arr1, arr2) to compare elements of arrays properly.

                                        // Also, after checking length mismatch, use 'return'
                                        // to stop further execution of the program.
            System.out.println("Anagram");
        } else{
            System.out.println("NOT Anagram");
        }


    }
}
