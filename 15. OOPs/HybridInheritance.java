// File: HybridInheritance.java

// 🔹 Parent class
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// 🔹 Child class (Single Inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// 🔹 Interface 1
interface Pet {
    void play();
}

// 🔹 Interface 2
interface Friendly {
    void nature();
}

// 🔹 Hybrid Inheritance
// Dog already inherited Animal
// Puppy inherits Dog + implements multiple interfaces

class Puppy extends Dog implements Pet, Friendly {

    public void play() {
        System.out.println("Playing...");
    }

    public void nature() {
        System.out.println("Friendly Nature...");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.eat();
        p1.bark();
        p1.play();
        p1.nature();
    }
}



/*
==================== 📌 HYBRID INHERITANCE (SHORT NOTES) ====================

1. 🔹 Definition
   - Hybrid Inheritance = combination of multiple inheritance types

--------------------------------------------------

2. 🔹 In this example

   ✔ Single Inheritance:
        Dog → Animal

   ✔ Multilevel Inheritance:
        Puppy → Dog → Animal

   ✔ Multiple Inheritance (through interfaces):
        Puppy implements Pet, Friendly

--------------------------------------------------

3. 🔹 Important Point ⚠️
   - Java does NOT support multiple inheritance using classes
   - But supports it using interfaces

--------------------------------------------------

4. 🔹 Why interfaces?
   - To avoid ambiguity (Diamond Problem)

--------------------------------------------------

5. 🔹 Interview Line
   👉 Hybrid inheritance is achieved in Java using interfaces

==================================================
*/