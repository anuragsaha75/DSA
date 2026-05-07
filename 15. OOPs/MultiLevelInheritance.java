public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dogs dobby  = new Dogs();
        System.out.println(dobby.legs=4);
        System.out.println(dobby.breed="Dobby Breed");
        dobby.eats();;
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

class Mammal extends Animal{
    int legs;
}

class Dogs extends Mammal{
    
    String breed;
}