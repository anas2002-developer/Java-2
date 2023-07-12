class Gadgets implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("Tablet");
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class thread2 {
    public static void main(String[] args) throws InterruptedException{
        Gadgets gd=new Gadgets();
        Thread t=new Thread(gd);

        t.start();

        for(int i=0;i<5;i++) {
            System.out.println("Phone");
            Thread.sleep(1000);
        }
    }
}

//IMPLEMENTING RUNNABLE INTERFACE

//we have created obj for Thread class and passed obj of Thread because Runnable interface
//don't have any start() method