abstract class Vehicle {
    abstract void calculateInsurance();
}
class Car extends Vehicle {
    void calculateInsurance() {
        System.out.println("Car Insurance: 50000");
    }
}
public class Main {
    public static void main(String[] args) {
        new Car().calculateInsurance();
    }
}
