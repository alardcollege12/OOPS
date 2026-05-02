class Student {
    String name;
    int rollNo;
    int marks;
    void display() {
        System.out.println(name + " " + rollNo + " " + marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sujal";
        s1.rollNo = 1;
        s1.marks = 90;
        s1.display();
    }
}
