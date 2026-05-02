class Employee {
    void calculateBonus() {
        System.out.println("Bonus");
    }
}
class Manager extends Employee {
    void calculateBonus() {
        System.out.println("Manager Bonus");
    }
}
class Clerk extends Employee {
    void calculateBonus() {
        System.out.println("Clerk Bonus");
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e;
        e = new Manager();
        e.calculateBonus();
        e = new Clerk();
        e.calculateBonus();
    }
}
