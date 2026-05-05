public class ClassesAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created object of Pen named p1

        p1.SetColour("Red");
        p1.SetThinkness(6);

        System.out.println(p1.colour);
        System.out.println(p1.thickness);
    }
}

class Pen {
    String colour;
    int thickness;

    void SetColour(String new_colour) {
        colour = new_colour;
    }

    void SetThinkness(int new_thickness) {
        thickness = new_thickness;
    }
}

class Student {
    String name;
    int grade;
    int percentage;

    void Set_Name(String new_name) {
        name = new_name;
    }

    void Set_Grade(int new_grade) {
        grade = new_grade;
    }

    void Set_Percentage(int phy, int chem, int math) {
        percentage = ((phy + chem + math) / 3) * 100;
    }
}

/*
==================== 📌 NOTES ====================

1. 🔹 Class & Object
   - Class → blueprint/template (Pen, Student)
   - Object → instance of class
   - Example:
        Pen p1 = new Pen();
        → p1 is object
        → Pen is class

--------------------------------------------------

2. 🔹 Object Creation (MDA concept)
   - new Pen() → creates object in heap memory
   - p1 → reference variable (stored in stack)
   - p1 points to object in heap

--------------------------------------------------

3. 🔹 Variables (Properties / Attributes)
   - colour, thickness → properties of Pen
   - name, grade, percentage → properties of Student

--------------------------------------------------

4. 🔹 Methods (Functions inside class)
   - Used to modify or use object data
   - Example:
        SetColour()
        SetThinkness()

--------------------------------------------------

5. 🔹 Using Object
   - Access data:
        p1.colour
   - Call method:
        p1.SetColour("Red")

--------------------------------------------------

6. 🔹 Default Values
   - String → null
   - int → 0
   - If not set, Java assigns default values

--------------------------------------------------

7. 🔹 Naming Convention (Important)
   - Methods should be camelCase:
        setColour() ✅
        setThickness() ✅
   - Avoid:
        SetColour(), SetThinkness() ❌

--------------------------------------------------

8. 🔹 Spelling Mistake Notice
   - "Thinkness" → should be "Thickness"

--------------------------------------------------

9. 🔹 Student Class Logic Issue ⚠️
   - percentage formula is wrong:
        ((phy+chem+math)/3)*100 ❌

   - Correct formula:
        (phy + chem + math) / 3  ✅
   - Because marks are already out of 100

--------------------------------------------------

10. 🔹 Encapsulation (Not used here)
   - Variables are not private
   - Direct access is allowed
   - Better practice:
        make variables private + use setters/getters

--------------------------------------------------

11. 🔹 Code Flow
   - Object created → p1
   - Values set using methods
   - Values printed using System.out.println()

--------------------------------------------------

12. 🔹 Memory Understanding
   - p1 → stack memory
   - actual object → heap memory

==================================================
*/