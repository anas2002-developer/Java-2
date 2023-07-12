class Bus extends Thread{
    int seat=1,passenger;
    Bus(int passenger){
        this.passenger=passenger;
    }

    @Override
    public synchronized void run(){
        String name=Thread.currentThread().getName();
        if(seat>=passenger){
            System.out.println("Seat allocated to "+name);
            seat-=passenger;
        }
        else{
            System.out.println("No Space");
        }
    }
}
public class methodSynchronization1 {
    public static void main(String[] args) {
        Bus b=new Bus(1);
        Thread b1=new Thread(b);
        Thread b2=new Thread(b);
        Thread b3=new Thread(b);

        b1.setName("p1 : Shruti");
        b2.setName("p2 : Palki");
        b3.setName("p3 : Saniya");

        b1.start();
        b2.start();
        b3.start();
    }
}

//synchronized keyword
//public synchronized void run()