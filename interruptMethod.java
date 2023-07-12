class interuption extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
                System.out.println(e);
                System.out.println("Thread Terminated");
        }
    }
}

public class interruptMethod {
    public static void main(String[] args) throws InterruptedException{
        interuption t1=new interuption();

        t1.start();
        t1.interrupt();
    }
}

//INTERRUPT METHOD