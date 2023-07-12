class PRIORITY extends Thread{
    public void run(){
        String s=Thread.currentThread().getName();
        System.out.print(s+" ");
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class priorityMethods {
    public static void main(String[] args) {
        PRIORITY p1=new PRIORITY();
        PRIORITY p2=new PRIORITY();

        p1.setPriority(6);
        p2.setPriority(Thread.MAX_PRIORITY);

        p1.start();
        p2.start();

    }
}

//PRIORITY METHODS - setPriority() and getPriority()
//RANGE - 1 to 10
