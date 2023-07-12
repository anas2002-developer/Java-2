import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file8 {
    public static void main(String[] args) throws IOException {
        byte buffer[]={60,62,66,67};
        ByteArrayInputStream bi3=new ByteArrayInputStream(buffer);

        int i=bi3.read();

        while(i!=-1){
            System.out.println((char)i);
            i=bi3.read();
        }
    }
}

//ByteArrayInputStream
