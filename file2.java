import java.io.*;
import java.io.IOException;

public class file2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo1 = new FileOutputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\fo1.txt");
        fo1.write(65);      //writes A
        fo1.close();
    }
}

//FileOuputStream