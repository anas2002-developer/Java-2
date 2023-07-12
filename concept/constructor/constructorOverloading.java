package concept.constructor;

class cO {
    int a,b;
    double d;

    cO()
    {
        a=10;
        b=20;
        d=1.5;
    }
    cO(int x,int y)
    {
        a=x;
        b=y;
    }
    cO(double k)
    {
        d=k;
    }
    void display(){
        System.out.println("int a  int b  double d   :   "+a+"  "+b+"  "+d);
    }
}
class constructorOverloading{
    public static void main(String[] args) {
        cO c8_1=new cO();
        cO c8_2=new cO(40,50);
        cO c8_3=new cO(15.5);
        c8_1.display();
        c8_2.display();
        c8_3.display();
    }
}

//constructor overloading
//if u have created parametrised constructor and calling default then u must define default const
// must not contain both private and default at the same time
