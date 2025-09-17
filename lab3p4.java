import java.util.*;

class Lab3p4 {
    String name;
    int age;
    Lab3p4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String... args) {
        Lab3p4 person1 = new Lab3p4("Shashank", 18);
        Lab3p4 person2 = new Lab3p4("Sreevatsav", 69);
        
        person1.display();
        person2.display();
    }
}
