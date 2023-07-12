import java.io.*;

public class file9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo3=new FileOutputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\fo3.txt");
        FileOutputStream fo4=new FileOutputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\fo4.txt");
        ByteArrayOutputStream bo3=new ByteArrayOutputStream();

        bo3.write(65);
        bo3.writeTo(fo3);
        bo3.writeTo(fo4);
        bo3.flush();
        bo3.close();
        }
}

//ByteArrayOutputStream
