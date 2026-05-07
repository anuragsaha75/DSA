public class SingleLevel_Inheritance {
    public static void main(String[] args) {
        Fish hilsha = new Fish();
        System.out.println(hilsha.fins=2);
        hilsha.eats();
        System.out.println(hilsha.colour="Silver White");
    }
}

class Animal{
    String colour;
    void eats(){
        System.err.println("Eats");
    }
    void breadth(){
        System.out.println("Breadths");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("It swims");
    }
}