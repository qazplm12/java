import java.io.FileWriter;
import java.io.Writer;

public class WriterEx2 {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("c:\\smart505\\writer2.txt");

        char[] data = "아이유유인나유재석유병재".toCharArray();

        // char[]배열의 내용을 한번에 쓰기

        writer.write(data,3,6);
        writer.flush();
        writer.close();
    }
}
