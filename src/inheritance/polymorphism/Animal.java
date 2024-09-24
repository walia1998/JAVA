package inheritance.polymorphism;

public class Animal {

    public void eat() {
        System.out.println("Animal is eating ");
    }
}

class Dog extends Animal {
    public void eat() { //Method OverRiding
        System.out.println("Dog is eating");
    }
}
class Cat extends Animal {
    public void eat() { //Method OverRiding
        System.out.println("Cat is eating");
    }
}


