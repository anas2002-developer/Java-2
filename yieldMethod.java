class yielding1 extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);
            Thread.yield();
        }
    }
}
class yielding2 extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);

        }
    }
}
public class yieldMethod {
    public static void main(String[] args) throws InterruptedException{
        yielding1 y1=new yielding1();
        yielding2 y2=new yielding2();

        y1.start();
        y2.start();

        }
}

//YIELD METHOD

//by default first thread is Thread-0 of class1
//by default second thread is Thread-1 of class2