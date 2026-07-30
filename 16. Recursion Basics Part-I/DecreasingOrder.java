// File: DecreasingOrder.java

public class DecreasingOrder {

    public static void main(String[] args) {

        int n = 10;

        PriDec(n);
    }

    public static void PriDec(int n) {

        // 🔹 Base Case
        // Stops recursion when n becomes 1
        if (n == 1) {
            System.out.print(n);
            return;
        }

        // 🔹 Work
        System.out.print(n + " ");

        // 🔹 Recursive Call
        // Function calls itself with smaller value
        PriDec(n - 1);
    }
}



/*
==================== 📌 RECURSION : DECREASING ORDER ====================

1. 🔹 Definition
   - Recursion = function calling itself

--------------------------------------------------

2. 🔹 Goal of this program
   - Print numbers from n to 1

--------------------------------------------------

3. 🔹 Base Case

        if(n == 1)

   ✔ Stops recursion
   ✔ Prevents infinite calls

--------------------------------------------------

4. 🔹 Recursive Call

        PriDec(n - 1);

   ✔ Function calls itself
   ✔ Problem becomes smaller each time

--------------------------------------------------

5. 🔹 Flow Understanding

        PriDec(10)
             ↓
        PriDec(9)
             ↓
        PriDec(8)
             ↓
             .
             .
             ↓
        PriDec(1)

--------------------------------------------------

6. 🔹 Output

        10 9 8 7 6 5 4 3 2 1

--------------------------------------------------

7. 🔹 Important Concept ⚠️
   - Recursion works using CALL STACK
   - Every function call gets stored in stack memory

--------------------------------------------------

8. 🔹 StackOverflowError ⚠️

   - If recursion never stops,
     stack memory keeps filling

   Example:
        function keeps calling itself infinitely

   Result:
        StackOverflowError

--------------------------------------------------

9. 🔹 Why Base Case is Important?
   - Base case stops recursive calls
   - Prevents StackOverflowError

--------------------------------------------------

10. 🔹 Golden Rule of Recursion
   Every recursive function must have:
        ✔ Base Case
        ✔ Recursive Call

--------------------------------------------------

11. 🔹 Interview Line
   👉 Recursion solves a problem by solving smaller subproblems

==================================================
*/