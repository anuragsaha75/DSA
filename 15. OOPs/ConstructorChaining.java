
class Animal {

    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {

    Horse() {

        // 🔹 calls parent constructor
        super();

        System.out.println("Horse constructor called");
    }
}

class BabyHorse extends Horse {

    BabyHorse() {

        // 🔹 calls Horse constructor
        super();

        System.out.println("BabyHorse constructor called");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {

        BabyHorse b1 = new BabyHorse();
    }
}