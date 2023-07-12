package concept.blocks;

class codeOrderOfBlocks{
    codeOrderOfBlocks(){
        System.out.println("3->constructor");
    }
    {
        System.out.println("2->instance");
    }
    static{
        System.out.println("1->static");
    }
    public static void main(String[] args) {

        codeOrderOfBlocks c9=new codeOrderOfBlocks();
    }
}

//execution order static block -> instance block -> constructor
