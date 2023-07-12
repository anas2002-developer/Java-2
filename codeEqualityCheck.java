public class codeEqualityCheck {
    public static void main(String[] args) {
        String s1="ASUS";
        String s2="ASUS";
        String s3=new String("ASUS");
        System.out.print("s1==s2  ");
        System.out.println(s1==s2);
        System.out.println("s1.equals(s2)  "+s1.equals(s2));
        System.out.print("s1==s3  ");
        System.out.println(s1==s3);
        System.out.println("s1.equals(s2)  "+s1.equals(s3));

//        == -> compares memory address
//        .equals() -> compares content
    }
}
