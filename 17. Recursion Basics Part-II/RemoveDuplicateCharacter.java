
public class RemoveDuplicateCharacter {
    
    public static void DuplicateLetterRemove(String str, int idx, StringBuilder newStr, boolean arr[] ){
        
        //Base Case

        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        // Kaam
        char current_character = str.charAt(idx);

        //Marked it as Visited
        if(arr[current_character-'a']==true){
            //if duplicate then do nothing and directly go for next index 
            DuplicateLetterRemove(str, idx+1, newStr, arr);

        } else{
            // if no duplicte (means False in array) then make it True
            arr[current_character-'a'] = true;

            // then Append it in newstring
            newStr.append(current_character);

            DuplicateLetterRemove(str, idx+1,newStr, arr);
        }

    }

    public static void main(String[] args) {
        // Input String
        String str = "appnnacollege";

        // Boolean array to keep track of visited characters
        boolean arr[] = new boolean[26];

        // Empty StringBuilder to store the answer
        StringBuilder newStr = new StringBuilder("");

        // Function Call
        DuplicateLetterRemove(str, 0, newStr, arr);

    }
}


/*
==========================================
NOTES : REMOVE DUPLICATES USING RECURSION
==========================================

Idea:
1. Traverse the string recursively.
2. Use a boolean array (size 26) to track visited characters.
3. If the character is already visited -> Skip it.
4. Otherwise:
   - Mark it as visited.
   - Append it to the answer.
5. Continue until the end of the string.

------------------------------------------
Meaning of boolean array
------------------------------------------

false -> Character not seen yet.
true  -> Character already seen.

Example:

'a' -> arr[0]
'b' -> arr[1]
'c' -> arr[2]
...
'z' -> arr[25]

Index Formula:

current_character - 'a'

Example:

'd' - 'a'
= 100 - 97
= 3

------------------------------------------
Base Case
------------------------------------------

if(idx == str.length()){
    print answer;
    return;
}

------------------------------------------
Time Complexity
------------------------------------------

O(n)

Each character is visited only once.

------------------------------------------
Space Complexity
------------------------------------------

O(n) -> Recursion Stack
O(26) -> Boolean Array (Constant)
Overall = O(n)
*/