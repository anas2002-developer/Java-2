import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file7 {
    public static void main(String[] args) throws IOException {
        FileReader fr2=new FileReader("C:\\Users\\anas4\\OneDrive\\Desktop\\fr2.txt");
        FileWriter fw2=new FileWriter("C:\\Users\\anas4\\OneDrive\\Desktop\\fw2.txt");

        int ch=fr2.read();

        while(ch!=-1){

            fw2.write((char)ch);
            ch= fr2.read();
        }
        fr2.close();
        fw2.close();
    }
}


//Copying File

//import java.io.*;
//
//public class anas{
//    public static void main(String[] args) {
//        File Reader r =new FileReader("C://Users//Asus//Desktop//aaaa.txt");
//        FileWriter w=new FileWriter(("C://Users//Asus//Desktop//ababa.txt"));
//
//        int i=r.read();
//
//        while(i=-1){
//            w.write((char)i);
//            i=r.read();
//        }
//        r.close();
//        w.close();
//    }
//}