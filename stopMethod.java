class ST extends Thread{
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for(int i=0;i<3;i++){
            System.out.println(name);
        }
    }
}

public class stopMethod {
    public static void main(String[] args) throws InterruptedException{
        ST s1=new ST();
        ST s2=new ST();
        ST s3=new ST();

        s1.setName("THREAD-1");
        s2.setName("THREAD-2");
        s3.setName("THREAD-3");

        s1.start();
        s2.start();
        s3.start();

        s2.stop();

    }
}

//STOP METHOD