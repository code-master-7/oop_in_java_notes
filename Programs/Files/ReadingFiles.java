package Files;


import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Xyz.txt");
        int i = fr.read();
        while (i != -1) {
            System.out.print((char) i); // if we don't typecast it, then it prints ASCII values
            i = fr.read();
        }
        fr.close();

    }
}
