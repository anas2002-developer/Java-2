class NabalikLadkaException extends RuntimeException{
    NabalikLadkaException(String msg){
        super(msg);
    }
}
public class throwKeyword2{
    public static void main(String[] args) {
        int age=16;
        if(age<18){
            throw new NabalikLadkaException("PADHAI LIKHAI MAI DHYAN LAGAO");
        }
        else{
            System.out.println("VOTE ALLOWED");
        }
        System.out.println("EXCEPTION HANDLED");
    }
}

//USER-DEFINED EXCEPTION (RuntimeException must be extended)

