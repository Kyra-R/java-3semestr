package work15;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JTextField jta = new JTextField("This is an area you can write text");
    JMenu menuFile = new JMenu("File");
    JMenu menuEdit = new JMenu("Edit");
    JMenu menuHelp = new JMenu("Help");
    JMenuBar mb = new JMenuBar();
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");
    JMenuBar m2 = new JMenuBar();
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem cut = new JMenuItem("Cut");

    Menu(){
        super("Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250, 130);
        add(btn1);
        add(btn2);
        add(jta);
        menuFile.add(save);
        menuFile.add(exit);
        menuEdit.add(copy);
        menuEdit.add(paste);
        menuEdit.add(cut);
        mb.add(menuFile);
        mb.add(menuEdit);
        mb.add(menuHelp);
        setJMenuBar(mb);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
