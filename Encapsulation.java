import java.util.Scanner;

class Authentication{
    private String dname="iphone 12";
    private String dRAM="4GB";
    private String dCamera="48MP";
    private String dBattery="2375mAH";
    private String password="anas2002";

    void aboutDevice(){
        String pass;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Login password = ");
        pass=sc.nextLine();
        if(pass.equals(password)){
            System.out.println(dname);
            System.out.println(dRAM);
            System.out.println(dCamera);
            System.out.println(dBattery);
        }
        else{
            System.out.println("Wrong Password");
        }
    }


}
public class Encapsulation {
    public static void main(String[] args) {
        Authentication auth=new Authentication();
        auth.aboutDevice();
    }
}

//Encapsulation i.e. private data members
// and public method
//It is a way to achieve data hiding
