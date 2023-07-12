package concept.superKeyword;

class Super1{
    int x=10;
    Super1(){
        System.out.println("Super Asus"+x);
    }
}
class Sub2 extends Super1 {
    Sub2(){
//        super(); automatically called
        System.out.println("Sub Asus"+x);

    }
}
public class superDefaultConstructor {
    public static void main(String[] args) {
        Sub2 s = new Sub2();
    }
}

