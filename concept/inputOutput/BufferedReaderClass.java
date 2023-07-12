package concept.inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    public static void main(String[] args)throws IOException {
        int x;
        String s;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Integer = ");
        x=Integer.parseInt(br.readLine());

        System.out.print("String = ");
        s=br.readLine();


        System.out.println("Integer : "+x);
        System.out.println("String : "+s);
    }
}
