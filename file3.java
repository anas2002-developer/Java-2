import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class file3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi2=new FileInputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\fi2.txt");
        BufferedInputStream bi2=new BufferedInputStream(fi2);

        int i=bi2.read();

        while(i!=-1){
            System.out.println((char)i);
            i=bi2.read();
        }
        bi2.close();
        fi2.close();
    }
}

//BufferdInputStream
