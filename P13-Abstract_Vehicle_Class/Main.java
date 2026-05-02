abstract class Vehicle {
    abstract void calculateInsurance();
}
class Car extends Vehicle {
    void calculateInsurance() {
        System.out.println("Car Insurance");
    }
}
public class Main {
    public static void main(String[] args) {
        new Car().calculateInsurance();
    }
}
