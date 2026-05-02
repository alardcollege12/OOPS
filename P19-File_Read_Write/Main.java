import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String data=sc.nextLine();
        FileWriter fw=new FileWriter("file.txt");
        fw.write(data);
        fw.close();
        BufferedReader br=new BufferedReader(new FileReader("file.txt"));
        String line;
        while((line=br.readLine())!=null)
            System.out.println(line);
        br.close();
    }
}
