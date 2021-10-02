import java.io.*;

public class Practical_6_3 {
    public static void main(String args[]) throws Exception {

        FileReader fr = new FileReader("file1.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;

        while ((i = br.read()) != -1) {

            System.out.print((char) i);
        }
        br.close();
        fr.close();

        System.out.println("\n\n20DCE019-Yatharth Chauhan");
    }
}