package OOPs;

public class PrivateClass {

     //Private Methods
   private String name;
    private String car;


    // Public method to handle private mehods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}


class Car {
    private String name;
    private String color;
}