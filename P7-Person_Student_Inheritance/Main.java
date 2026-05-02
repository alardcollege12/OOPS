class Person {
    String name;
}
class Student extends Person {
    int rollNo;
    void display() {
        System.out.println(name + " " + rollNo);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sujal";
        s.rollNo = 1;
        s.display();
    }
}
