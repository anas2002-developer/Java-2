package concept.thisKeyword;

public class thisReferenceID {
    void name(){
        System.out.println("this : "+this);
    }
    public static void main(String[] args) {
        thisReferenceID ct=new thisReferenceID();
        System.out.println("object : "+ct);
        ct.name();
    }
}

//this refers to the current object inside METHOD or COSTRUCTOR

