package inheritance;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.speak();
       // d.secretMethod();
        Animal a = new Animal();

      //  a.speak(); // they nothing call speak method the child will not flow to the parent
      Parrot p = new Parrot();
        System.out.println(p.country);
     }
}
