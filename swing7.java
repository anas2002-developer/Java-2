import javax.swing.*;

public class swing7 {
    swing7(){
        JFrame f=new JFrame();

        JMenuBar mbar=new JMenuBar();
        JMenu menu1=new JMenu("MENU");
        JMenu submenu=new JMenu("SUBMENU");

        JMenuItem m1=new JMenuItem("Open");
        JMenuItem m2=new JMenuItem("Save");
        JMenuItem m3=new JMenuItem("Settings");
        JMenuItem m4=new JMenuItem("Import Settings");
        JMenuItem m5=new JMenuItem("Export Settings");

        menu1.add(m1);
        menu1.add(m2);
        menu1.add(m3);
        submenu.add(m4);
        submenu.add(m5);
        menu1.add(submenu);
        mbar.add(menu1);

        f.setJMenuBar(mbar);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        swing7 s7=new swing7();
    }
}