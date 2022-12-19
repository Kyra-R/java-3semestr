package work16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseColor extends JFrame {
    JTextArea jtext = new JTextArea("ИКБО-01-21",2,5);
    JMenu menuFile = new JMenu("Color");
    JMenu menuEdit = new JMenu("Font");
    JMenuBar mb = new JMenuBar();
    JMenuItem tnr = new JMenuItem("Times New Roman");
    JMenuItem sans = new JMenuItem("MS Sans Serif");
    JMenuItem courier = new JMenuItem("Courier New");
    JMenuItem red = new JMenuItem("Red");
    JMenuItem black = new JMenuItem("Black");
    JMenuItem blue = new JMenuItem("Blue");

    ChooseColor(){
        super("Выбор");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(200, 150);
        jtext.setEditable(false);
        add(jtext);
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtext.setForeground(Color.BLACK);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtext.setForeground(Color.RED);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtext.setForeground(Color.BLUE);
            }
        });
        tnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtext.setFont(new Font("Times New Roman", Font.BOLD, 12));
            }
        });
        sans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtext.setFont(new Font("MS Sans Serif", Font.BOLD, 12));
            }
        });
        courier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtext.setFont(new Font("Courier New", Font.BOLD, 12));
            }
        });
        menuEdit.add(sans);
        menuEdit.add(tnr);
        menuEdit.add(courier);

        menuFile.add(black);
        menuFile.add(blue);
        menuFile.add(red);

        mb.add(menuFile);
        mb.add(menuEdit);

        setJMenuBar(mb);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChooseColor();
    }
}