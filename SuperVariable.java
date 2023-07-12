class codeeSV{
    int x=100;
}
class subSV extends codeeSV{
    int x=105;
    subSV(){
        System.out.println("subclass "+x);
        System.out.println("superclass "+super.x);
    }
}
public class SuperVariable {
    public static void main(String[] args) {
        subSV sv=new subSV();
    }
}
