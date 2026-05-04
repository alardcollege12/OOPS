class Person {
    String name;
    int age;
}
class Teacher extends Person {
    String subject;
    double salary;
    void display(){
        System.out.println(name+" "+age+" "+subject+" "+salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="Ram";
        t.age=25;
        t.subject="Math";
        t.salary=40000;
        t.display();
    }
}
