import java.io.*;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) throws IOException{
        FileInputStream fi1=new FileInputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\fi1.txt");

        int i=fi1.read();

        while(i!=-1){
            System.out.println((char)i);
            i = fi1.read();
        }
        fi1.close();
    }
}

//FileInputStream
