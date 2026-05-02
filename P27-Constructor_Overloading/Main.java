class Student {
    String name;
    int age;
    Student(){
        name="Default";
        age=0;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" "+age);
    }
}
public class Main {
    public static void main(String[] args) {
        new Student().display();
        new Student("Sujal",20).display();
    }
}
