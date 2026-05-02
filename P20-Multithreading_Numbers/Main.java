class T1 extends Thread {
    public void run() {
        for(int i=1;i<=50;i++)
            System.out.println(i);
    }
}
class T2 extends Thread {
    public void run() {
        for(int i=51;i<=100;i++)
            System.out.println(i);
    }
}
public class Main {
    public static void main(String[] args) {
        new T1().start();
        new T2().start();
    }
}
