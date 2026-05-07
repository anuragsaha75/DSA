

// 🔹 Method Overloading → Compile-time Polymorphism
class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }
}


// 🔹 Method Overriding → Runtime Polymorphism
class Animal {

    void eat() {
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal {

    @Override
    void eat() {
        System.out.println("Eats Grass");
    }
}


public class Polymorphism {
    public static void main(String[] args) {

        // 🔹 Compile-time Polymorphism
        Calculator c1 = new Calculator();

        System.out.println(c1.sum(2, 3));
        System.out.println(c1.sum(2, 3, 4));
        System.out.println(c1.sum(2.5, 3.5));

        // 🔹 Runtime Polymorphism
        Deer a1 = new Deer();
        a1.eat();
    }
}