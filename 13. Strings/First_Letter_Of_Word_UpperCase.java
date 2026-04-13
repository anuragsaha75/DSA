
public class First_Letter_Of_Word_UpperCase {

    // Function to convert first letter of each word to uppercase
    public static String toUpperCase(String str) {

        /*
        StringBuilder is used because String is immutable.
        If we modify String many times, new objects are created.

        StringBuilder allows modification in the same object,
        making the program faster and memory efficient.
        */
        StringBuilder sb = new StringBuilder("");



        /*
        Step 1
        Convert the FIRST character of the string to uppercase
        */

        char ch = Character.toUpperCase(str.charAt(0));

        /*
        Append this uppercase character to StringBuilder
        */
        sb.append(ch);



        /*
        Step 2
        Traverse the rest of the string
        */
        for(int i = 1; i < str.length(); i++) {

            /*
            If current character is SPACE
            and it is not the last character
            */

            if(str.charAt(i) == ' ' && i < str.length()-1) {

                /*
                Append the space
                */
                sb.append(str.charAt(i));

                /*
                Move to next character
                */
                i++;

                /*
                Convert next character to uppercase
                because it is the first letter of a new word
                */
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else {

                /*
                Otherwise just append the character normally
                */
                sb.append(str.charAt(i));
            }
        }

        /*
        Convert StringBuilder → String
        */
        return sb.toString();
    }



    public static void main(String args[]) {

        String str = "hi, i am anurag saha";

        /*
        Call the function
        */
        System.out.println(toUpperCase(str));
    }
}


//  https://www.programiz.com/online-compiler/3rX5s9ia94mkr

//SOLVED BY ME(ANURAG SAHA)