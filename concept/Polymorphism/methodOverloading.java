package concept.Polymorphism;

class MO{
    int add(int x,int y){
        System.out.print("ADDITION of int int : ");
        return (x+y);
    }
    void add(int z,double a){
        System.out.println("ADDITION of int double : "+(z+a));
    }
    void add(double m,int n){
        System.out.println("ADDITION of double int : "+(m+n));
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        MO obj=new MO();
        System.out.println(obj.add(10,20));
        obj.add(5,6.5);
        obj.add(7.6,6);
    }
}

//Method Overloading --> CPT or Static binding or Early Binding
//datatypes of functions can be same or different
//method overloading can be done in inheritance too