import java.awt.*;

public class awt3{

    awt3() {
        Frame f=new Frame();
        Button b1 = new Button("BUTTON 1");
        Button b2 = new Button("BUTTON 2");
        Button b3 = new Button("BUTTON 3");
        Button b4 = new Button("BUTTON 4");
        Button b5 = new Button("BUTTON 5");

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
        awt3 a3=new awt3();
    }
}

//BORDER LAYOUT awt
