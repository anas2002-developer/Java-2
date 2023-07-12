class pC {
    int a, b;
    String s;

    pC(){
        a=5;b=10;s="fnksa";
        System.out.println(a+b+s);
    }
    pC(int x, int y) {
        a = x;
        b = y;
        System.out.println("Parametrised Const 1 : ");
        System.out.println(a + "  " + b);
    }

    pC(int g, String f) {
        a = g;
        s = f;
        System.out.println("Parametrised Const 2 : ");
        System.out.println(a + "  " + s);
    }
}

class parametrisedConstructor {
    public static void main(String[] args) {
        pC c5_1 = new pC(4, 10);
        pC c5_2 = new pC(4, "asus");
        pC c5_3 = new pC();
    }
}

// parametrised constructor
//if u have defined parametrised constructor and creating obj for default constructor then it shows error