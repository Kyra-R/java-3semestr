package work12;

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.File;

public class Picture extends JFrame {

    public Picture() {
        String pic;
        Scanner in = new Scanner(System.in);
        System.out.println("1 for your own pic, 0 for predetermined");

        int n = in.nextInt();
        if(n==1) {
            pic = in.nextLine();
            pic = in.nextLine();
        } else {
            pic = "src/work12/pngwing1.png";
        }
            File file = new File(pic);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Pic");
            this.setSize(500, 640);
            if (file.exists()) {
                JPanel panel = new JPanel();
                panel.setSize(500,640);
                panel.setBackground(Color.WHITE);
                ImageIcon icon = new ImageIcon(pic);
                JLabel label = new JLabel();
                label.setIcon(icon);
                panel.add(label);
                this.getContentPane().add(panel);
                this.pack();
            }

    }

    public static void main(String[] args) {
        new Picture().setVisible(true);
    }

}