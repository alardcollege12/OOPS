class Vehicle {
    String brand;
}
class Car extends Vehicle {
    void show() {
        System.out.println(brand);
    }
}
class Bike extends Vehicle {
    void show() {
        System.out.println(brand);
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Honda";
        c.show();
        Bike b = new Bike();
        b.brand = "Yamaha";
        b.show();
    }
}
