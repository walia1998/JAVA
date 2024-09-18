package OOPs;
// If we have same name Constructor so then we can say constructor overload
public class Person {
    String name;
    int age;
    double height;
    String eyeColor;
    // We have not used static there so all attributes belongs to the object/instance

//    public Person() {
//        // constructor same as class only difference is construct which does not have any return type
//        name = "Sania Walia";
//        age = 21;
//        height = 5.3;
//        eyeColor = "Brown";   // Hard Code
//
//    }
    //Default Constructor
    public Person() {

    }
public Person(String name, int age){
    System.out.println("Inside The constructor with 2 args");
        this.name = name;
        this.age = age;

}



    //We Can use dynamic Constructor


    public Person(String name, int age, double height, String eyeColor) {
        this(name,age);
        System.out.println("Inside The constructor with 4 args");
        // this.name = name;
        // this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
     // there this is Instance/Object this will be used to reference the obj will be created after calling this constructor person which calling the arguments

    }

    public void speak() {
        System.out.println("Speaking my details, my name is " + name + ", age is " + age + " and height is " + height);
    }
    public void eat() {
        System.out.println("I am eating ");
    }

    public void walk() {
        System.out.println("I am walking ");
    }
}
