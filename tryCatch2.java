public class tryCatch2 {
    public static void main(String[] args) {
        String s="asus";
        try {
            System.out.println(Integer.parseInt(s));
        }
        catch(NumberFormatException e){
            System.out.println("CATCH BLOCK : "+e);
        }
        System.out.println("Exception Handled");
    }
}

//NumberFormat Exception
//Integer.parseInt is used for converting string to integer