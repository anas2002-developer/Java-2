public class thisPConstructor {
    thisPConstructor(){
        this(105);
        System.out.println("Default Constructor");
    }
    thisPConstructor(int x){
        System.out.println("Parametrised Constructor "+ x);
    }
    public static void main(String[] args) {
        thisPConstructor ct=new thisPConstructor();
    }
}

//this(int x) calls parametrised constructor
