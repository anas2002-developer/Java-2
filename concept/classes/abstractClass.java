package concept.classes;

abstract class BATTERY{
    abstract void batterylife();
}
class apple extends BATTERY {
    @Override
    void batterylife(){
        System.out.println("APPLE : 2350mAH");
    }
}
class oneplus extends BATTERY {
    @Override
    void batterylife(){
        System.out.println("ONEPLUS : 4000mAH");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        BATTERY a=new apple();
        oneplus b=new oneplus();
        a.batterylife();
        b.batterylife();
    }
}

//Abstract class cant be instantiated but referenced
//Abstract class hide implementation

