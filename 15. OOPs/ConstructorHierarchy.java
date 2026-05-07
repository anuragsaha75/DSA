public class ConstructorHierarchy {
    public static void main(String[] args) {

        // 🔹 Object of child class
        B obj = new B();
    }
}

// 🔹 Parent Class
class A {

    A() {
        System.out.println("Constructor A is called");
    }
}

// 🔹 Child Class
class B extends A {

    B() {

        // Java automatically calls parent constructor first
        System.out.println("Constructor B is called");
    }
}



/*
==================== 📌 CONSTRUCTOR CALLING HIERARCHY ====================

1. 🔹 Important Rule
   - Parent constructor runs before child constructor

--------------------------------------------------

2. 🔹 Flow

        B obj = new B();

        ↓

        A() constructor called first

        ↓

        B() constructor called

--------------------------------------------------

3. 🔹 Why?
   - Child class first initializes parent properties

--------------------------------------------------

4. 🔹 Internal Working

   Java automatically adds:

        super();

   inside child constructor

--------------------------------------------------

5. 🔹 Constructor Chain

        Object
           ↓
           A
           ↓
           B

   Constructors run from TOP → BOTTOM

--------------------------------------------------

6. 🔹 Output

        Constructor A is called
        Constructor B is called

--------------------------------------------------

7. 🔹 Important Point ⚠️
   - Constructor is NOT inherited
   - But constructor calling happens automatically

--------------------------------------------------

8. 🔹 Interview Line
   👉 Parent constructor executes before child constructor

==================================================
*/