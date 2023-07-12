import java.awt.*;

public class awt1 extends Frame {

    awt1() {
        Button b = new Button("Click Here");
        b.setBounds(30,100,80,10);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setTitle("FRAME");
        add(b);
    }

    public static void main(String[] args) {
        awt1 a1=new awt1();
    }
}
