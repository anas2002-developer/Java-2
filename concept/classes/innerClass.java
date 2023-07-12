package concept.classes;

public class innerClass {
    private int a=10;
    class imInner{
        void msg(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        innerClass.imInner obj=new innerClass().new imInner();
        obj.msg();
    }
}

//INNER CLASS
