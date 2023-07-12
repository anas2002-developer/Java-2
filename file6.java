import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file6 {
    public static void main(String[] args) throws IOException {
        FileWriter fw1=new FileWriter("C:\\Users\\anas4\\OneDrive\\Desktop\\fw1.txt");

        String s="file writer 1";

        fw1.write(s);
        fw1.close();
    }
}

//FileWriter
