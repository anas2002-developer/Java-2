import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class file10 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo5=new FileOutputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\fo5.txt");
        PrintStream p1=new PrintStream(fo5);

        p1.println(65);
        p1.println("asus");

        p1.close();
        fo5.close();
    }
}

//PrintStream