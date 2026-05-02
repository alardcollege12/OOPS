abstract class Employee {
    abstract double calculateSalary();
}
class Manager extends Employee {
    double calculateSalary() {
        return 50000;
    }
}
class Clerk extends Employee {
    double calculateSalary() {
        return 20000;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e;
        e = new Manager();
        System.out.println(e.calculateSalary());
        e = new Clerk();
        System.out.println(e.calculateSalary());
    }
}
