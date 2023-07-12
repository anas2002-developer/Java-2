class Gadget extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
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
public class thread1 {
    public static void main(String[] args) throws InterruptedException {
        Gadget g=new Gadget();
        g.start();

        for(int i=0;i<5;i++) {
            System.out.println("Phone");
            Thread.sleep(1000);
        }
    }
}

//EXTENDING THREAD CLASS

//throws cant be used with overriden method
//run function must be public + void
//class Gadget is a Thread
//There are 2 threads main thread called by JVM and Gadget thread
//1000 milli sec = 1 sec
//Main thread has two function i.e. to execute its statements and create obj for new thread
//start() method of Thread class used to start thread and call run()