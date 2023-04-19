import java.io.FileReader;
import java.io.Reader;

public class ReaderEx2 {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("c:\\smart505\\to.txt");

        int readData;
        char[] cbuf = new char[2];
        String data = "";

        while (true) {
            readData = reader.read(cbuf);

            if (readData == -1) {
                break;
            }
            data += new String(cbuf, 0, readData);
        }
        System.out.println(data);

        reader.close();
    }
}
