
// 🔹 Interface 1
interface Animal {

    // by default → public abstract
    void eat();
}

// 🔹 Interface 2
interface Pet {

    void play();
}

// 🔹 Class implementing multiple interfaces
class Dog implements Animal, Pet {

    // implementation of Animal interface method
    public void eat() {
        System.out.println("Dog Eats");
    }

    // implementation of Pet interface method
    public void play() {
        System.out.println("Dog Plays");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.play();
    }
}



/*
==================== 📌 INTERFACE (SHORT NOTES) ====================

1. 🔹 Definition
   - Interface is a blueprint of a class
   - Used to achieve abstraction

--------------------------------------------------

2. 🔹 Important Features
   ✔ Methods are abstract by default
   ✔ Variables are public static final by default
   ✔ Cannot create object of interface

--------------------------------------------------

3. 🔹 Keyword Used

   interface → create interface
   implements → use interface

--------------------------------------------------

4. 🔹 Why use Interface?
   ✔ Achieve abstraction
   ✔ Achieve multiple inheritance
   ✔ Loose coupling
   ✔ Common rules/structure

--------------------------------------------------

5. 🔹 Multiple Inheritance using Interface

   class Dog implements Animal, Pet

   ✔ Dog gets features of:
        Animal
        Pet

--------------------------------------------------

6. 🔹 Why Java uses Interface for Multiple Inheritance?
   - Avoids ambiguity problem (Diamond Problem)

--------------------------------------------------

7. 🔹 Difference

   extends → class inheritance
   implements → interface inheritance

--------------------------------------------------

8. 🔹 Important Point ⚠️
   - Class must implement ALL interface methods

--------------------------------------------------

9. 🔹 Real-life Example

   Smartphone:
        Camera interface
        MusicPlayer interface
        Internet interface

--------------------------------------------------

10. 🔹 Interview Line
   👉 Java achieves multiple inheritance using interfaces

==================================================
*/




/*
==================== 📌 IMPORTANT JAVA KEYWORDS ====================

1. 🔹 final Keyword
   - Used to restrict modification

--------------------------------------------------

2. 🔹 final Variable
   - Value cannot be changed

   Example:
        final int age = 10;

        age = 20; ❌ Error

--------------------------------------------------

3. 🔹 final Method
   - Cannot be overridden

   Example:
        final void sleep(){}

--------------------------------------------------

4. 🔹 final Class
   - Cannot be inherited

   Example:
        final class Bird {}

--------------------------------------------------

5. 🔹 default Keyword
   - Used for:
        ✔ default access modifier
        ✔ default methods in interface

--------------------------------------------------

6. 🔹 Default Access Modifier
   - If no modifier written,
     Java uses default access

   Example:

        class Test {}

   Accessible only inside same package

--------------------------------------------------

7. 🔹 default Method (Java 8+)

   Interface can contain method body

   Example:

        interface Animal {

            default void sleep() {
                System.out.println("Sleeping");
            }
        }

--------------------------------------------------

8. 🔹 static Keyword
   - Belongs to class, not object

   Example:
        static int count;

--------------------------------------------------

9. 🔹 this Keyword
   - Refers to current object

--------------------------------------------------

10. 🔹 super Keyword
   - Refers to parent class object

--------------------------------------------------

11. 🔹 abstract Keyword
   - Used for abstraction
   - Abstract class cannot create object

--------------------------------------------------

12. 🔹 Interview Line
   👉 final restricts modification, default provides default behavior/access

==================================================
*/