public class CopyConstructor {
    public static void main(String[] args) {

        // 🔹 Original object
        Student s1 = new Student();
        s1.name = "Shradha";
        s1.roll = 456;
        s1.password = "abcd";

        // 🔹 Copy object using copy constructor
        Student s2 = new Student(s1);
        s2.password = "xyz"; // change only s2 password

        // 🔹 Print values
        System.out.println(s1.name + " " + s1.roll + " " + s1.password);
        System.out.println(s2.name + " " + s2.roll + " " + s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;

    // 🔹 Copy Constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        // this.password=s1.password;               // password intentionally not copied (for security example)
    }

    // 🔹 Default Constructor
    Student() {
        System.out.println("Constructor is called...");
    }
}


/*
==================== 📌 COPY CONSTRUCTOR (SHORT NOTES) ====================

1. 🔹 Definition (Easy)
   - Copy Constructor = creates a new object by copying another object

--------------------------------------------------

2. 🔹 Syntax

        Student s2 = new Student(s1);

--------------------------------------------------

3. 🔹 How it works?
   - Takes object as parameter
   - Copies values from old object to new object

--------------------------------------------------

4. 🔹 Why use it?
   - To duplicate objects
   - To avoid modifying original object

--------------------------------------------------

5. 🔹 Important Point ⚠️
   - You can control what to copy
   - Example:
        password not copied (security reason)

--------------------------------------------------

6. 🔹 Output Understanding

   s1 → original object
   s2 → copied object

   Changing s2 does NOT affect s1

--------------------------------------------------

7. 🔹 Interview Line
   👉 Copy constructor is used to create a new object by copying values of another object

==================================================
*/