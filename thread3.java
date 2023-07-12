class threadScheduler extends Thread{
    @Override
    public void run() {
        String str=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(str);
        }
    }
}
public class thread3 {
    public static void main(String[] args){
        threadScheduler g1=new threadScheduler();
        threadScheduler g2=new threadScheduler();
        threadScheduler g3=new threadScheduler();

        g1.setName("T1");
        g2.setName("T2");
        g3.setName("T3");

        g1.start();
        g2.start();
        g3.start();

        String str=Thread.currentThread().getName();
        for(int i=0;i<3;i++) {
            System.out.println(str);
        }
    }
}

//THREAD SCHEDULER

//setName() -> setting name for thread
//currentThread.getName() -> getting name of current thread