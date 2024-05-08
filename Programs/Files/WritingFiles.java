package Files;

import java.io.*;


public class WritingFiles {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Xyz.txt");
        fw.write("100");
        fw.write("Evang\n vvpclg");
        fw.flush();
    }
}
