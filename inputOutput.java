import java.util.Scanner;  //input
import java.lang.System;  //output

public class inputOutput {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a+" "+b);
    }
}
