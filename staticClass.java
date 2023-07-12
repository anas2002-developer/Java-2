public class staticClass {
    static int a=10;
    static class imStatic{
        void msg(){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        imStatic obj=new imStatic();
        obj.msg();
    }
}
