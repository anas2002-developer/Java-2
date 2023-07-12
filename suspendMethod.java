class suspendingndresuming extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);
        }
    }
}

public class suspendMethod {
    public static void main(String[] args) throws InterruptedException{
        suspendingndresuming sr=new suspendingndresuming();
        suspendingndresuming sr2=new suspendingndresuming();
        suspendingndresuming sr3=new suspendingndresuming();

        sr.setName("THREAD-1");
        sr2.setName("THREAD-2");
        sr3.setName("THREAD-3");

        sr.start();
        sr2.start();

        sr2.suspend();

        sr3.start();

        sr2.resume();

    }
}

//SUSPEND METHOD & RESUME METHOD