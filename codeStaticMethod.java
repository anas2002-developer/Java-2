class coding{
    int X=20;
    void MYNAME(){
        System.out.println("ASUS");
    }

    public static void main(String[] args) {
        coding cd=new coding();
        cd.MYNAME();
        System.out.println(cd.X);
    }
}

public class codeStaticMethod {
    static int x=10;
    static void myName(){
        System.out.println("Asus");
    }
    public static void main(String[] args) {
        myName();
        System.out.println(x);
    }
}


//main is static method so it can only static variables or methods
//object of class needs to be created to call non static variables or methods
