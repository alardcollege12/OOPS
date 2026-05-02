class Rectangle {
    double l,b;
    Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    void display(){
        System.out.println(l*b);
        System.out.println(2*(l+b));
    }
}
public class Main {
    public static void main(String[] args) {
        new Rectangle(4,3).display();
    }
}
