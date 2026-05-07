// File: StaticKeyword.java

public class StaticKeyword {
    public static void main(String[] args) {

        Student s1 = new Student();

        // 🔹 Static variable belongs to class
        s1.SchoolName = "ACI";

        System.out.println(s1.SchoolName);

        s1.SetName("Anurag Saha");

        System.out.println(s1.GetName());

        Student s2 = new Student();

        // 🔹 s2 did not set SchoolName
        // But still it can access "ACI"
        // because static variable is shared among all objects
        System.out.println(s2.SchoolName);

        // 🔹 Changing SchoolName using s2
        // will also change SchoolName for s1
        // because only ONE shared copy exists
        s2.SchoolName = "Techno";

        System.out.println(s1.SchoolName); // Techno
        System.out.println(s2.SchoolName); // Techno

        s2.SetName("Anubhab Saha");

        System.out.println(s2.GetName());
    }
}

class Student {

    String name;

    // 🔹 static variable
    // only one copy shared among all objects
    static String SchoolName;

    void SetName(String name) {
        this.name = name;
    }

    String GetName() {
        return this.name;
    }
}



/*
==================== 📌 STATIC KEYWORD (SHORT NOTES) ====================

1. 🔹 Definition
   - static means belonging to class, not object

--------------------------------------------------

2. 🔹 Static Variable
   - Only ONE copy created
   - Shared among all objects

--------------------------------------------------

3. 🔹 Example

        static String SchoolName;

   ✔ common for every student

--------------------------------------------------

4. 🔹 Important Concept ⚠️

   s1.SchoolName = "ACI";

   Even though only s1 sets value,
   s2 can also access same value.

--------------------------------------------------

5. 🔹 Shared Memory Concept

   s2.SchoolName = "Techno";

   ✔ Changes SchoolName for ALL objects

   Because:
        only one shared copy exists

--------------------------------------------------

6. 🔹 Output Understanding

        System.out.println(s1.SchoolName);

   Output:
        Techno

--------------------------------------------------

7. 🔹 Memory Concept

   Non-static variable:
        separate copy for each object

   Static variable:
        single shared copy

--------------------------------------------------

8. 🔹 Preferred Syntax

        Student.SchoolName = "ACI";

   Better than:

        s1.SchoolName = "ACI";

--------------------------------------------------

9. 🔹 static Methods
   - Belong to class
   - Can be called without object

--------------------------------------------------

10. 🔹 Interview Line
   👉 static members belong to class and are shared among all objects

==================================================
*/