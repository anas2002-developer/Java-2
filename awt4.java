import java.awt.*;

public class awt4{

    awt4() {
        Frame f=new Frame();
        Button b1 = new Button("BUTTON 1");
        Button b2 = new Button("BUTTON 2");
        Button b3 = new Button("BUTTON 3");
        Button b4 = new Button("BUTTON 4");

        f.setLayout(new GridLayout(2,2,10,20));

        f.setSize(400,400);
        f.setVisible(true);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
    }

    public static void main(String[] args) {
        awt4 a4=new awt4();
    }
}

//GRID LAYOUT awt
