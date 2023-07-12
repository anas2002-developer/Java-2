package concept.thisKeyword;

public class thisDConstructor {
    thisDConstructor(){
        System.out.println("Default Constructor");
    }
    thisDConstructor(int x){
        this();
        System.out.println("Parametrised Constructor "+ x);
    }
    public static void main(String[] args) {
        thisDConstructor ct=new thisDConstructor(100);
    }
}

//this() calls default constructor
