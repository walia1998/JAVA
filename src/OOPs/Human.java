package OOPs;

public interface Human {
    void sleep();

    void eat();
    // abstract methods

    //default method
    default void dance() {
        System.out.println("Human dance by default");
    }
    //Static Method
    static void play() {
        System.out.println("Playing for humans is good for the health");
    }
}
