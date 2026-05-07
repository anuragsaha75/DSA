// File: SuperKeyword.java

class Animal {

    String colour = "Brown";

    Animal() {
        System.out.println("Animal constructor is called");
    }

    void eat() {
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal {

    String colour = "Black";

    Horse() {

        // 🔹 calls parent constructor
        super();

        System.out.println("Horse constructor is called");
    }

    void PrintColour() {

        // 🔹 current class variable
        System.out.println(this.colour);

        // 🔹 parent class variable
        System.out.println(super.colour);
    }

    void display() {

        // 🔹 calling parent class method
        super.eat();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        Horse h1 = new Horse();

        h1.PrintColour();

        h1.display();
    }
}

/*
==================== 📌 SUPER KEYWORD (SHORT NOTES) ====================

1. 🔹 Definition
   - super refers to immediate parent class object

--------------------------------------------------

2. 🔹 Uses of super
   ✔ Call parent constructor
   ✔ Access parent variable
   ✔ Call parent method

--------------------------------------------------

3. 🔹 super()

   super();

   ✔ Calls parent constructor
   ✔ Must be first statement in constructor

--------------------------------------------------

4. 🔹 Access Parent Variable

        super.colour

   ✔ accesses parent class variable

--------------------------------------------------

5. 🔹 Access Parent Method

        super.eat();

   ✔ calls parent class method

--------------------------------------------------

6. 🔹 this vs super

   this → current object/class
   super → parent object/class

--------------------------------------------------

7. 🔹 Constructor Flow

        Horse object created
             ↓
        Animal constructor runs first
             ↓
        Horse constructor runs

--------------------------------------------------

8. 🔹 Output Understanding

        Black
        Brown
        Animal Eats

--------------------------------------------------

9. 🔹 Interview Line
   👉 super is used to access immediate parent class members

==================================================
*/