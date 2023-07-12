import javax.swing.*;
import java.awt.*;

public class awt6{

    awt6() {
        Frame f=new Frame();
        Button b1 = new Button("BUTTON 1");
        Button b2 = new Button("BUTTON 2");
        Button b3 = new Button("BUTTON 3");
        Button b4 = new Button("BUTTON 4");

        f.setLayout(new BoxLayout(f,BoxLayout.X_AXIS));

        f.setSize(400,400);
        f.setVisible(true);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
    }

    public static void main(String[] args) {
        awt6 a6=new awt6();
    }
}

//BOX LAYOUT awt
