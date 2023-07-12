public class tryCatchFinally2 {
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            System.out.println(a / b);
        }
        catch(ArithmeticException e){
            System.out.println(500/b);
            System.out.println("CATCH BLOCK : "+e);
        }
        finally {
            System.out.println("FINALLY BLOCK");
        }
        System.out.println("Exception Handled");
    }
}

//if Catch executed NT else AT
//finally is executed always