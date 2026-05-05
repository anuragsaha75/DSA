public class Constructor {
    public static void main(String[] args) {

        // 🔹 Object creation
        Student s1 = new Student();              // calls default constructor
        Student s2 = new Student("Anurag");      // calls parameterized constructor

        System.out.println(s2.name);
    }
}

class Student {
    String name;
    int roll;

    // 🔹 Default Constructor
    Student() { // Constructor Has No Return Type
        System.out.println("Default constructor is called...");
    }

    // 🔹 Parameterized Constructor
    Student(String name) {
        this.name = name;
        System.out.println("Parameterized constructor is called...");
    }
}



/*
==================== 📌 CONSTRUCTORS (SHORT NOTES) ====================

1. 🔹 Definition (Easy)
   - Constructor = special method called automatically when object is created

--------------------------------------------------

2. 🔹 Key Points
   ✔ Same name as class
   ✔ No return type (not even void)
   ✔ Called automatically
   ✔ Used to initialize object

--------------------------------------------------

3. 🔹 Types of Constructors
   1. Default Constructor → no parameters
   2. Parameterized Constructor → with parameters

--------------------------------------------------

4. 🔹 Example Flow

        Student s1 = new Student();
        → Default constructor called

        Student s2 = new Student("Anurag");
        → Parameterized constructor called

--------------------------------------------------

5. 🔹 Role of "this"
   - Refers to current object

   Example:
        this.name = name;

--------------------------------------------------

6. 🔹 Important Point ⚠️
   - Constructor runs only once at object creation

--------------------------------------------------

7. 🔹 Memory Concept
   - new → allocates memory
   - constructor → initializes object

--------------------------------------------------

8. 🔹 Interview Line
   👉 Constructor is used to initialize objects automatically when created

==================================================
*/