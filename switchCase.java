import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int integer;
        int A=10,B=20;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer (1-4) : ");
        integer=sc.nextInt();

        switch (integer){
            case 1:
                System.out.println("ADDITION :"+(A+B));
            case 2:
                System.out.println("SUBSTRACTION :"+(A-B));
            case 3:
                System.out.println("MULTIPLICATION :"+(A*B));
            case 4:
                System.out.println("DIVISON :"+(A/B));
            default:
                System.out.println("WRONG CHOICE");
        }
    }
}
