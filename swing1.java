import javax.swing.*;

public class swing1 extends JFrame {

    swing1() {
        JButton b = new JButton("Click Here");
        b.setBounds(30,100,80,10);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        setTitle("FRAME");
        add(b);
    }

    public static void main(String[] args) {
        swing1 s1=new swing1();
    }
}
