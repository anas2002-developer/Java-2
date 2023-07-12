import javax.swing.*;
import java.awt.*;

public class swing3{

    swing3() {
        JFrame f=new JFrame();
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");

        f.setLayout(new BorderLayout(10,20));

        f.setSize(400,400);
        f.setVisible(true);

        f.add(b1,"North");
        f.add(b2,"South");
        f.add(b3,"East");
        f.add(b4,"West");
        f.add(b5,"Center");
    }

    public static void main(String[] args) {
        swing3 s3=new swing3();
    }
}

//BORDER LAYOUT swing
