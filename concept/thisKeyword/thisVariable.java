package concept.thisKeyword;

public class thisVariable {
    int x;
    thisVariable(int x){
        this.x=x+5;
        System.out.println("x : "+x);
        System.out.println("this.x : "+this.x);
    }
    public static void main(String[] args) {
        thisVariable cT=new thisVariable(100);
    }
}

//this.x refers instance variable of class

