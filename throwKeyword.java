public class throwKeyword {
    public static void main(String[] args) {
        int a=10,b=0;
        if(b==0){
            throw new ArithmeticException("EXCEPTION MESSAGE");
        }
        else{
            System.out.println(a/b);
        }
        System.out.println("EXCEPTION HANDLED");
    }
}

//PREDEFINED EXCEPTION

//throw passes exception object created by programmer to the JVM rest main method creates exception object and passes to the JVM
//throw doesn't handle exception
//throw can be used for both predefined and user defined exceptions
//throw is generally used with user defined exceptions
//CALLER of main method is JVM