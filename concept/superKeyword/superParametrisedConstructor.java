package concept.superKeyword;

class SuperSc{
    int x=10;
    SuperSc(int x){
        System.out.println("Super Asus"+x);
    }
}
class SubSc extends SuperSc {
    SubSc(){
        super(40);
        System.out.println("Sub Asus"+x);

    }
}

public class superParametrisedConstructor {
    public static void main(String[] args) {
        SubSc s = new SubSc();
    }
}

// super contains para const and subclass default const contains super() i.e. default const so it gives error
//so para const must be passed
