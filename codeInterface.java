interface Laptop{
    int price=100000;      //public + static + final
    abstract void Brand();    //public + abstract
}
class codeInterface implements Laptop{
    public void Brand(){
        System.out.println("Asus");
    }
    public static void main(String[] args) {
        Laptop lp=new codeInterface();
        lp.Brand();
        System.out.println(price);
    }
}

//Referenced Interface
//Static variable can be called without obj in same or extended class


