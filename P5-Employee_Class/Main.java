class Employee {
    private int id;
    private String name;
    private double salary;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(1);
        e.setName("Sujal");
        e.setSalary(50000);
        e.display();
    }
}
