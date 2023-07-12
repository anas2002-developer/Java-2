import java.awt.*;
import javax.swing.*;

public class swing5{

    swing5() {
        JFrame f=new JFrame();
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");

        f.setLayout(new FlowLayout(FlowLayout.RIGHT,10,20));

        f.setSize(400,400);
        f.setVisible(true);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
    }

    public static void main(String[] args) {
        swing5 s5=new swing5();
    }
}

//FLOW LAYOUT swing
