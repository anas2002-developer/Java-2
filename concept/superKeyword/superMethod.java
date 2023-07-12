package concept.superKeyword;

class codeeSM{
    void name(){
        System.out.println("super Asus");
    }
}
class subSM extends codeeSM {
    void name(){
        System.out.println("sub Asus");
        super.name();
    }

}
public class superMethod {
    public static void main(String[] args) {
        subSM sm=new subSM();
        sm.name();
    }
}

