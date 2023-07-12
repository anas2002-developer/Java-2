package concept.inputOutput;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(a+" "+b);
    }
}
