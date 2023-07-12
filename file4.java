import java.io.*;

public class file4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo2=new FileOutputStream("C:\\Users\\anas4\\OneDrive\\Desktop\\fo2.txt");
        BufferedOutputStream bo2=new BufferedOutputStream(fo2);

        String so2="Laptop Chalao";
        byte b[]=so2.getBytes();
        System.out.println(b);
        bo2.write(b);
        bo2.close();
        fo2.close();
    }
}

//BufferedOutputStream
