import java.io.FileReader;
import java.io.IOException;

public class file5 {
    public static void main(String[] args) throws IOException {
        FileReader fr1=new FileReader("C:\\Users\\anas4\\OneDrive\\Desktop\\fr1.txt");

        int ch=fr1.read();

        while(ch!=-1){
            System.out.println((char)ch);
            ch= fr1.read();
        }
        fr1.close();
    }
}

//FileReader
