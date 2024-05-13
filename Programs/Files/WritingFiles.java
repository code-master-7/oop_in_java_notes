package Files;

import java.io.*;


public class WritingFiles {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Xyz.txt");
        fw.write("100");
        fw.write("Evan\n vvpclg");
        fw.flush();
    }
}
