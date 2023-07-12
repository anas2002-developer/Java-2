//SYNCHRONIZED BLOCK
class TABLE{
    synchronized void display(int n){

            for (int i = 1; i < 11; i++) {
                System.out.println(n * i );

        }
    }
}

class Tthread1 extends Thread{
    TABLE t;
    Tthread1(TABLE t){
        this.t=t;
    }
    public void run(){
        t.display(10);
    }
}

class Tthread2 extends Thread{
    TABLE t;
    Tthread2(TABLE t){
        this.t=t;
    }
    public void run(){
        t.display(8);
    }
}

public class synchronizedBlock1 {
    public static void main(String[] args) {
        TABLE obj=new TABLE();

        Tthread1 T1=new Tthread1(obj);
        Tthread2 T2=new Tthread2(obj);

        T1.start();
        T2.start();

    }
}
