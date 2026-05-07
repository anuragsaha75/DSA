public class ShallowCopy {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name ="Anurag Saha";
        s1.roll=123;
        s1.password="abcd";

        
        Student s2 = new Student(s1);
        // s2.name = "Anubhab Saha";
        // s2.roll = 456;
        s2.password="abcd";

        System.out.println(s2.name);
    }
}


class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){         // Shallow Copy 
        this.name=s1.name;
        this.roll=s1.roll;
    }

    Student(){

    }
}


/*
==================== 📌 SHALLOW COPY (SHORT NOTES) ====================

1. 🔹 Definition
   - Shallow Copy copies values/references from one object to another

--------------------------------------------------

2. 🔹 In this example
   - name and roll copied from s1 → s2

        this.name = s1.name;
        this.roll = s1.roll;

--------------------------------------------------

3. 🔹 Important Point ⚠️
   - Primitive types (int, char, etc.) copy actual values
   - Objects/arrays copy references

--------------------------------------------------

4. 🔹 Why called "Shallow"?
   - Because memory is shared for reference-type data

--------------------------------------------------

5. 🔹 Problem in Shallow Copy
   - Changes in copied object's reference data
     may affect original object

--------------------------------------------------

6. 🔹 In this code
   - String is immutable, so no issue here
   - But arrays/objects can create problems

--------------------------------------------------

7. 🔹 Difference

   Shallow Copy:
        shares reference

   Deep Copy:
        creates separate memory

--------------------------------------------------

8. 🔹 Interview Line
   👉 Shallow copy copies references, deep copy creates new memory

==================================================
*/