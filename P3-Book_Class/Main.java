import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    void input() {
        Scanner sc = new Scanner(System.in);
        title = sc.nextLine();
        author = sc.nextLine();
        price = sc.nextDouble();
    }
    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}
public class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.input();
        b.display();
    }
}
