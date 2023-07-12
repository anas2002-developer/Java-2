package concept.constructor;

class DF{
    int a;
    String s;
}
class problem1 {
    public static void main(String[] args) {
        DF c3=new DF();
        System.out.println(c3.a+"  "+c3.s);
    }
}

//every class has default constructor
// i.e. which initialise variables with 0 and string with null and boolean with false and double with 0.0.
