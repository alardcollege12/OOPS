class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        new Dog().sound();
        new Cat().sound();
    }
}
