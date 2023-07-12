class JM extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);
        }
    }
}
public class joinMethod {
    public static void main(String[] args) throws InterruptedException{
        JM t1=new JM();
        JM t2=new JM();
        JM t3=new JM();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");


        t2.start();
        t2.join();

        t1.start();
        t3.start();

        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++) {
            System.out.println(name);
        }
    }
}

//JOIN METHOD