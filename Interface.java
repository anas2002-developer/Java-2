interface Battery{
    int aa=100;      //public + static + final
    abstract void Batterylife();    //public + abstract
}
interface CAMERA{
    int bb=200;      //public + static + final
    abstract void cameraMP();   //public + abstract
}
class Samsung implements Battery,CAMERA{
    @Override
    public void Batterylife(){          //public
        System.out.println("SAMSUNG : 5000mAH");
    }
    @Override
    public void cameraMP(){             //public
        System.out.println("SAMSUNG : 102MP");
    }
}
public class Interface {
    public static void main(String[] args) {
        Samsung a=new Samsung();
        a.Batterylife();
        a.cameraMP();
//        System.out.println(aa+"  "+bb);

    }
}

//Interface cant be instantiated but referenced
//Interface hide implementation
//Interface is the blueprint of class
