

public class String_Important_Concept {

    public static void main(String[] args) {

        // -------------------------------
        // CASE 1 : String Literal
        // -------------------------------

        String s1 = "Tony";
        String s2 = "Tony";

        /*
         THEORY:
         Java stores string literals in a special memory area called the "String Pool".

         When we write:
         String s1 = "Tony";
         String s2 = "Tony";

         Java does NOT create two separate objects.
         Both s1 and s2 point to the SAME object in the String Pool.

         String Pool
         -------------
           "Tony"
           ↑   ↑
          s1   s2
        */

        if (s1 == s2) {
            System.out.println("s1 and s2 reference the same object (== is TRUE)");
        } else {
            System.out.println("s1 and s2 reference different objects");
        }


        // -------------------------------
        // CASE 2 : Using new keyword
        // -------------------------------

        String s3 = new String("Tony");

        /*
         THEORY:
         The 'new' keyword forces Java to create a NEW object in Heap memory.

         So even if the content is the same ("Tony"),
         the memory location will be different.

         String Pool        Heap
         ------------      --------
            "Tony"          "Tony"
             ↑  ↑             ↑
            s1  s2            s3

         Therefore:
         s1 == s3  -> FALSE
         because they are different objects in memory.

         This Concept is Called INTERNING
         
        */

        if (s1 == s3) {
            System.out.println("s1 and s3 reference the same object");
        } else {
            System.out.println("s1 and s3 reference different objects (== is FALSE)");
        }


        // -------------------------------
        // CASE 3 : Comparing String values
        // -------------------------------

        String a = "Hello";
        String b = new String("Hello");

        /*
         THEORY:

         == operator → compares MEMORY LOCATION (reference comparison)

         .equals() method → compares ACTUAL STRING CONTENT (value comparison)

         Even though "a" and "b" contain the same text ("Hello"),
         they are stored in different memory locations.
        */

        System.out.println(a == b);      // false -> different memory locations
        System.out.println(a.equals(b)); // true  -> same string value


        /*
         Memory Representation

         String Pool        Heap
         ------------      --------
           "Hello"          "Hello"
             ↑                ↑
             a                b

         a == b        -> FALSE
         a.equals(b)   -> TRUE
        */

    }
}
