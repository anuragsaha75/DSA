//Qs.

//Print all binary strings of size N without consecutive ones.


public class BinaryString {

    public static void PrintAllBinaryStringNsizewithoutConsecutive1(int n, int lastplace,String str){
        //Base Case
        if(n==0){
            System.out.println(str);
            return;
        }

        // We can ALWAYS put 0
        PrintAllBinaryStringNsizewithoutConsecutive1(n - 1, 0, str + "0");

        // We can put 1 ONLY if previous character was 0
        if (lastplace == 0) {
            PrintAllBinaryStringNsizewithoutConsecutive1(n - 1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        PrintAllBinaryStringNsizewithoutConsecutive1(3,0,"");
    }
}



/*
=================================================
PRINT BINARY STRINGS WITHOUT CONSECUTIVE 1s
=================================================

Example:
n = 3

Output:
000
001
010
100
101

Logic:
------
lastplace tells us what the previous digit was.

1. We can ALWAYS add 0.
2. We can add 1 ONLY when lastplace == 0.
   This prevents "11" from being generated.

Parameters:
-----------
n         -> Number of positions still remaining.
lastplace -> Previous digit (0 or 1).
str       -> Binary string created so far.

Base Case:
----------
When n == 0, required length is reached.
Print the string and return.

Recursive Choices:
------------------
Add 0:
    function(n-1, 0, str+"0")

Add 1:
    Only if lastplace == 0
    function(n-1, 1, str+"1")

Initial Call:
-------------
function(3, 0, "")

We start lastplace with 0 so that the first
position is allowed to contain either 0 or 1.

Main Rule:
----------
Previous = 0  -> Can add 0 or 1
Previous = 1  -> Can add only 0
=================================================
*/