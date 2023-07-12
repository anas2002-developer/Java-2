import javax.swing.*;
public class swing2 {

    swing2() {

        JFrame f = new JFrame();

        JLabel l = new JLabel("Employee id:");
        JButton b = new JButton("Submit");
        JTextField t = new JTextField("TF",69);
        JRadioButton j1 = new JRadioButton("Radio Button 1");
        JRadioButton j2 = new JRadioButton("Radio Button 1");

        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);
        j1.setBounds(200, 200, 40, 30);
        j2.setBounds(250, 240, 40, 30);

        ButtonGroup bg=new ButtonGroup();
        bg.add(j1);
        bg.add(j2);

        f.add(b);
        f.add(l);
        f.add(t);
        f.add(j1);
        f.add(j2);

        f.setSize(400,300);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        swing2 s2 = new swing2();
    }
}    