public class tryCatch3 {
    public static void main(String[] args) {
        for(int i=0;i<11;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("CATCH BLOCK : "+ e);
            }
            System.out.println("EXCEPTION HANDLED");
        }
    }
}
