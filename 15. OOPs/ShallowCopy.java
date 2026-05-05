public class ShallowCopy {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name ="Anurag Saha";
        s1.roll=123;
        s1.password="abcd";

        
        Student s2 = new Student(s1);
        // s2.name = "Anubhab Saha";
        // s2.roll = 456;
        s2.password="abcd";

        System.out.println(s2.name);
    }
}


class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }

    Student(){

    }
}