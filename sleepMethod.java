class SM extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class sleepMethod {
    public static void main(String[] args) throws InterruptedException{
        SM t1=new SM();
        SM t2=new SM();
        SM t3=new SM();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++) {
            System.out.println(name);
            Thread.sleep(1000);
        }
    }
}

//SLEEP METHOD