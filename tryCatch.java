public class tryCatch {
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println("CATCH BLOCK : "+e);
        }
        System.out.println("Exception Handled");
    }
}

//Arithemetic Exception
