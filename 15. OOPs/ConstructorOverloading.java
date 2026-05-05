public class ConstructorOverloading {
    public static void main(String[] args) {

        // 🔹 Different objects using different constructors
        Student s1 = new Student();             // default constructor
        Student s2 = new Student("Shradha");    // parameterized (String)
        Student s3 = new Student(123);          // parameterized (int)

        // Student s4 = new Student("Aman", 567); ❌ error (no such constructor yet)
    }
}

class Student {
    String name;
    int roll;

    // 🔹 Default Constructor
    Student() {
        System.out.println("Constructor is called...");
    }

    // 🔹 Parameterized Constructor (String)
    Student(String name) {
        this.name = name;
    }

    // 🔹 Parameterized Constructor (int)
    Student(int roll) {
        this.roll = roll;
    }
}



/*
==================== 📌 CONSTRUCTOR (SHORT NOTES) ====================

1. 🔹 Definition (Easy)
   - Constructor = special method called automatically when object is created

--------------------------------------------------

2. 🔹 Key Rules
   ✔ Same name as class
   ✔ No return type
   ✔ Called automatically
   ✔ Used to initialize object

--------------------------------------------------

3. 🔹 Types of Constructors
   1. Default → no parameters
   2. Parameterized → takes values
   3. Copy Constructor

--------------------------------------------------

4. 🔹 Constructor Overloading
   - Multiple constructors with different parameters

   Example:
        Student()
        Student(String name)
        Student(int roll)

--------------------------------------------------

5. 🔹 this keyword
   - Refers to current object

   Example:
        this.name = name;

--------------------------------------------------

6. 🔹 Important Point ⚠️
   - If you define parameterized constructor,
     Java does NOT create default constructor automatically

--------------------------------------------------

7. 🔹 Error Case
   - If constructor not defined:

        new Student("Aman", 567); ❌

--------------------------------------------------

8. 🔹 Memory Concept
   - new → allocates memory
   - constructor → initializes object

--------------------------------------------------

9. 🔹 Interview Line
   👉 Constructor is used to initialize object at the time of creation

==================================================
*/