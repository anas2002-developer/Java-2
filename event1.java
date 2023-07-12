import java.awt.*;
import java.awt.event.*;

public class event1 implements ActionListener {
    TextField tf;
    event1(){
        Frame f=new Frame();

        Button b = new Button("BUTTON 1");
        tf = new TextField();


        b.setBounds(180,50,80,20);
        tf.setBounds(80,50,100,20);


        b.addActionListener(this);

        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("EVENT ^_^");
    }

    public static void main(String[] args) {
        event1 e1=new event1();
    }
}