class Student {
    void setMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100)
            throw new Exception("Invalid Marks Entered");
        else
            System.out.println("Marks: " + marks);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            new Student().setMarks(110);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
