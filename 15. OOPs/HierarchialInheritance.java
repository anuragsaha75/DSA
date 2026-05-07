public class HierarchialInheritance{
    public static void main(String[] args) {
        Birds Tiya = new Birds();
        Tiya.fly();
    }
}

class Animal{
    void eats(){
        System.out.println("Eats");
    }
    void breadth(){
        System.out.println("Breadth");
    }
}

class Mammal extends Animal{
    void walks(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swims(){
        System.out.println("Swims");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}