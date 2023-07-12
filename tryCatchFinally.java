public class tryCatchFinally {
    public static void main(String[] args) {
        int a=10,b=0;
        try {
            System.out.println(a / b);
        }
        catch(NumberFormatException e){
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