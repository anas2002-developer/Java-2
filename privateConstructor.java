class privateConstructor{
    int a,b;
    String s;
    private privateConstructor(){
        a=5;b=10;
        System.out.println("private Const : ");
        System.out.println(a+"  "+b);
    }
    public static void main(String[] args) {
        privateConstructor c7=new privateConstructor();
    }
}

//private constructor
