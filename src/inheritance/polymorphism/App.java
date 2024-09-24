package inheritance.polymorphism;

public class App {
 public static void feedAnimal(Animal animal) {
     animal.eat();
 }
    public static void main(String[] args) {

// RunTime Polumorphosim.
        Animal a1 = new Animal();

        Animal a2 = new Dog();

       // Dog d = new Animal(); // this is not allowed child object with the parent type because cat is also a animal
        Animal a3  = new Cat();

        feedAnimal(a3);
    }
}
