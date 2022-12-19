package work12;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;
public class Animation2 extends JFrame{


    public static void main(String[] args) throws InterruptedException {

        Animation2 frame = new Animation2();

        while(true){

            frame.getPanel().repaint();

        }
    }

    private MyPanel panel;

    public Animation2(){
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Animation");

        panel = new MyPanel(0);

        this.add(panel);

        this.setVisible(true);
    }


    public MyPanel getPanel(){
        return panel;
    }

    public class MyPanel extends JPanel{

        private int x=0;


        public MyPanel(int x){
            this.x = x;

        }

        ImageIcon icon = new ImageIcon("src/work12/pngwing1.png");
        JLabel label = new JLabel();
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            try {
                Thread.sleep(700);
            } catch (InterruptedException reallyIgnored) {}

            String pic = "src/work12/pngwing"+this.x+".png";
            if(x<3) {
                x += 1;
            } else {
                x=1;
            }
            icon = new ImageIcon(pic);
            label.setIcon(icon);
            panel.add(label);


            //draws a rectangle at the x and y values
            g.fillRect(x*10, 10, 50, 50);
        }

    }
}

