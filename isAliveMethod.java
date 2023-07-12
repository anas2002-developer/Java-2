class aliving extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        System.out.println(name);
    }
}

public class isAliveMethod {
    public static void main(String[] args) throws InterruptedException{
        aliving t1=new aliving();
        aliving t2=new aliving();

        System.out.println(t1.isAlive());
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());


    }
}

//ISALIVE METHOD
//if we do t.start() but there is no run() function in thread
//then main calls run method of Thread class which doesn't contain anything