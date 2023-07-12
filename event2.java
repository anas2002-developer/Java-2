import javax.swing.*;
import java.awt.event.*;

public class event2 implements ActionListener {
    JTextField tf1;
    JTextField tf2;
    JTextField tfresult;

    event2(){
        JFrame f=new JFrame();

        JButton b = new JButton("BUTTON 1");
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        tfresult = new JTextField(10);
        JLabel l1=new JLabel("First : ");
        JLabel l2=new JLabel("Second : ");
        JLabel l3=new JLabel("Sum : ");

        l1.setBounds(100,100,50,30);
        tf1.setBounds(150,100,50,30);
        l2.setBounds(100,140,50,30);
        tf2.setBounds(150,140,50,30);
        l3.setBounds(100,180,50,30);
        tfresult.setBounds(150,180,50,30);

        b.setBounds(200,300,100,50);

        b.addActionListener(this);

        f.add(l1);
        f.add(tf1);
        f.add(l2);
        f.add(tf2);
        f.add(l3);
        f.add(tfresult);
        f.add(b);

        f.setSize(400,400);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int i1=Integer.parseInt(tf1.getText());
        int i2=Integer.parseInt(tf2.getText());
        int i3=i1+i2;

        tfresult.setText(" "+i3);
    }

    public static void main(String[] args) {
        event2 e2=new event2();
    }
}