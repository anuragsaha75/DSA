
public class Abstract {
    public static void main(String[] args) {

        Horse h1 = new Horse();

        h1.eat();
        h1.walk();

        // 🔹 At this point colour is still "Brown"
        // because constructor already initialized it
        // and ChangeColour() is NOT called yet
        System.out.println(h1.colour);

        // 🔹 Now colour changes
        h1.ChangeColour();

        System.out.println(h1.colour);

        Chicken ch1 = new Chicken();

        ch1.eat();
        ch1.walk();

        // ❌ Cannot create object of abstract class
        // Animal a1 = new Animal();
    }
}

// 🔹 Abstract Class
abstract class Animal {

    String colour;

    // 🔹 Abstract class can have constructor
    Animal() {
        colour = "Brown";
    }

    // 🔹 Normal method
    void eat() {
        System.out.println("Animal Eats");
    }

    // 🔹 Abstract Method
    // No implementation/body here
    abstract void walk();
}

class Horse extends Animal {

    // 🔹 This method does NOT run automatically
    // Must be called manually
    void ChangeColour() {
        colour = "Dark Brown";
    }

    // implementation of abstract method
    void walk() {
        System.out.println("Horse Walks on 4 legs");
    }
}

class Chicken extends Animal {

    void ChangeColour() {
        colour = "White";
    }

    void walk() {
        System.out.println("Chicken Walks on 2 legs");
    }
}



/*
==================== 📌 ABSTRACT CLASS (SHORT NOTES) ====================

1. 🔹 Definition
   - Abstract class = restricted class
   - Cannot create object directly

--------------------------------------------------

2. 🔹 abstract Keyword
   - Used to create:
        ✔ Abstract class
        ✔ Abstract method

--------------------------------------------------

3. 🔹 Abstract Method
   - Method without body

   Example:
        abstract void walk();

--------------------------------------------------

4. 🔹 Important Rule ⚠️
   - Child class MUST implement abstract methods

--------------------------------------------------

5. 🔹 Abstract Class can have:
   ✔ Constructors
   ✔ Normal methods
   ✔ Variables
   ✔ Abstract methods

--------------------------------------------------

6. 🔹 Object Creation

   Animal a1 = new Animal(); ❌

   Because abstract class object cannot be created

--------------------------------------------------

7. 🔹 Constructor in Abstract Class
   - Runs automatically when child object is created

   Example:
        Horse h1 = new Horse();

   → Animal constructor runs first
   → colour = "Brown"

--------------------------------------------------

8. 🔹 Important Concept ⚠️

   Methods do NOT run automatically.

   Example:
        h1.ChangeColour();

   Until method is called:
        colour remains "Brown"

--------------------------------------------------

9. 🔹 Flow Understanding

   Horse h1 = new Horse();
        ↓
   Constructor runs automatically
        ↓
   colour = "Brown"

   h1.ChangeColour();
        ↓
   colour = "Dark Brown"

--------------------------------------------------

10. 🔹 Method Overriding
   - Horse and Chicken override walk()

--------------------------------------------------

11. 🔹 Why use Abstract Class?
   - To provide common structure/rules

--------------------------------------------------

12. 🔹 Interview Line
   👉 Abstract class cannot be instantiated and may contain abstract methods

==================================================
*/