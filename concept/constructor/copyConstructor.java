package concept.constructor;

class cC{
    int a,b;
    String s;
    cC(){
        a=5;b=10;
        System.out.println("Default Const : ");
        System.out.println(a+"  "+b);
    }

    cC(cC ref){
        System.out.println("Copy Const : ");
        System.out.println(ref.a+"  "+ref.b);
    }
}
class copyConstructor {
    public static void main(String[] args) {
        cC c6_1=new cC();
        cC c6_2=new cC(c6_1);
    }
}

//copy constructor
