// File: DeepCopy.java

public class DeepCopy {
    public static void main(String[] args) {

        // 🔹 Original object
        Student s1 = new Student();
        s1.name = "Anurag";
        s1.roll = 123;

        s1.marks[0] = 90;
        s1.marks[1] = 80;
        s1.marks[2] = 70;

        // 🔹 Deep copied object
        Student s2 = new Student(s1);

        // changing copied object's data
        s2.marks[0] = 100;

        // 🔹 Output
        System.out.println(s1.marks[0]); // 90 (unchanged)
        System.out.println(s2.marks[0]); // 100
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    // 🔹 Deep Copy Constructor
    Student(Student s1) {

        this.name = s1.name;
        this.roll = s1.roll;

        // separate memory allocation
        this.marks = new int[3];

        // copying values one by one
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // 🔹 Default Constructor
    Student() {
        marks = new int[3];
    }
}




/*
==================== 📌 DEEP COPY (SHORT NOTES) ====================

1. 🔹 Definition
   - Deep Copy creates separate memory for copied object

--------------------------------------------------

2. 🔹 Key Feature
   - Original object and copied object are independent

--------------------------------------------------

3. 🔹 In this example

        this.marks = new int[3];

   ✔ New array memory created

--------------------------------------------------

4. 🔹 Why use loop?

        this.marks[i] = s1.marks[i];

   ✔ Copies actual values one by one

--------------------------------------------------

5. 🔹 Result

        s2.marks[0] = 100;

   ✔ s1 remains unchanged
   ✔ No shared memory

--------------------------------------------------

6. 🔹 Deep Copy vs Shallow Copy

   Shallow Copy:
        shares reference

   Deep Copy:
        creates separate memory

--------------------------------------------------

7. 🔹 Important Point ⚠️
   - Arrays & objects should use Deep Copy

--------------------------------------------------

8. 🔹 Interview Line
   👉 Deep copy creates completely independent object memory

==================================================
*/