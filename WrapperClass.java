public class WrapperClass {
    public static void main(String[] args) {
        int pd1=10;
        Integer wcd1=pd1;
        //AUTOBOXING

        System.out.println("PRIMITIVE DATATYPE : "+pd1+"\nWRAPPER CLASS OBJECT : "+wcd1);


        Character wcd2='a';
        char pd2=wcd2;
        //UNBOXING

        System.out.println();
        System.out.println("WRAPPER CLASS OBJECT : "+wcd2+"\nPRIMITIVE DATATYPE : "+pd2);
    }
}
