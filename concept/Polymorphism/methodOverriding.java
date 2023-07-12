package concept.Polymorphism;

class A{
    void name(){
        System.out.println("Super Asus");
    }
}
class B extends A {
    @Override
    void name(){                        //method overriding
        System.out.println("Sub Asus");
    }

    int name(int x){
        System.out.print("METHOD OVERLOADING : ");
        return x;
    }
}
public class methodOverriding {
    public static void main(String[] args) {
        A obj1=new B();
        A obj2=new A();
        B obj3=new B();
        System.out.print("A->B : ");obj1.name();
        System.out.print("A->A : ");obj2.name();
        System.out.print("B->B : ");obj3.name();

        System.out.println(obj3.name(5));           //method overloading in different class
    }
}

//Method Overriding
//method name and parameters and return type must be same
//A -> B means method exists in both SUPER & SUB class
