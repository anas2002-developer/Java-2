public class codeFinally {
    public static void main(String[] args) {
        int a=20,b=0;
        try{
            System.out.println(a/b);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println(a/b);
            System.out.println("FINALLY BLOCK");
        }
        System.out.println("EXCEPTION HANDLED");
    }
}

//finally block is not executed because of exception in finally block