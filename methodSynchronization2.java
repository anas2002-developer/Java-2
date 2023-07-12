class Table{
    public synchronized void display(int n){
        for (int i=1;i<11;i++){
            System.out.println(n*i);
        }
    }
}

class THREAD1 extends Thread{
    Table t;
    THREAD1(Table t){
        this.t=t;
    }
    public void run(){
        t.display(10);
    }
}
class THREAD2 extends Thread{
    Table t;
    THREAD2(Table t){
        this.t=t;
    }
    public void run(){
        t.display(11);
    }
}
public class methodSynchronization2 {
    public static void main(String[] args) {
        Table obj=new Table();

        THREAD1 T1=new THREAD1(obj);
        THREAD2 T2=new THREAD2(obj);

        T1.start();
        T2.start();
    }
}
