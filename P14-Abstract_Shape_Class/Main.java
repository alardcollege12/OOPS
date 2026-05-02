abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double r = 5;
    double area() {
        return 3.14 * r * r;
    }
}
class Rectangle extends Shape {
    double l=4,b=3;
    double area() {
        return l*b;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new Circle().area());
        System.out.println(new Rectangle().area());
    }
}
