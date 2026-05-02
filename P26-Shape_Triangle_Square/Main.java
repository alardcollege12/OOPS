class Shape {
    void display(){
        System.out.println("Shape");
    }
}
class Triangle extends Shape {
    void display(){
        System.out.println("Triangle");
    }
}
class Square extends Shape {
    void display(){
        System.out.println("Square");
    }
}
public class Main {
    public static void main(String[] args) {
        new Triangle().display();
        new Square().display();
    }
}
