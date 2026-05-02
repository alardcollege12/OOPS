import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        int lines=0,words=0,chars=0;
        String line;
        while((line=br.readLine())!=null){
            lines++;
            chars+=line.length();
            words+=line.split(" ").length;
        }
        br.close();
        System.out.println(lines+" "+words+" "+chars);
    }
}
