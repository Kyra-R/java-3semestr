package work12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.image.BufferedImage;


public class Shapes2 extends JPanel{
    //static Graphics2D g2;




    public abstract class Shape{
        public String color;

        public int Xpos;
        public int Ypos;

        public void randomizeColor(){
            final Random random = new Random();
            int num = (random.nextInt()%5+4)%5;
            if(num==0){
                color="BLACK";
            }
            else if (num == 1){
                color="RED";
            }
            else if (num == 2){
                color="GREEN";
            }
            else if (num == 3){
                color="BLUE";
            }
            else if (num == 4){
                color="ORANGE";
            }
        }

        public void setColor(Graphics g2){
            if(color=="BLACK"){
                g2.setColor(Color.BLACK);
            }
            else if (color=="RED"){
                g2.setColor(Color.RED);
            }
            else if (color=="GREEN"){
                g2.setColor(Color.GREEN);
            }
            else if (color == "BLUE"){
                g2.setColor(Color.BLUE);
            }
            else if (color == "ORANGE"){
                g2.setColor(Color.ORANGE);
            }
        }
        public void randomizePos() {
            final Random random = new Random();
            Xpos = (random.nextInt()%400+399)%325+25;
            Ypos = (random.nextInt()%500+499)%325+25;
        }

    }

     class Circle extends Shape {
        Circle(Graphics g){
            // paintComponent();
            randomizeColor();
            randomizePos();
            setColor(g);
            g.fillOval(Xpos, Ypos, 40, 40);
        }

    }

     class Triangle extends Shape {
        Triangle(Graphics g){
            randomizeColor();
            randomizePos();
            setColor(g);
            g.fillPolygon(new int[] {Xpos-20,Xpos+10,Xpos+20}, new int[] {Ypos+10,Ypos-10,Ypos+10}, 3);
        }
    }

     class Rectangle extends Shape {
        Rectangle(Graphics g){
            randomizeColor();
            randomizePos();
            setColor(g);
            g.fillRect(Xpos, Ypos, 40, 40);
        }
    }
   Circle c;
    Triangle t;
    Rectangle r;


    public void paint(Graphics g){

        final Random random = new Random();
        int num ;
        for(int i=0;i<20;i++){
            num = (random.nextInt() % 3 + 2) % 3;
            if(num==0){
                c= new Shapes2.Circle(g);
            } else if (num==1){
                t= new Shapes2.Triangle(g);
            } else if (num==2){
                r = new Shapes2.Rectangle(g);
            }

        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Draw 20 shapes");
        f.setSize(400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new Shapes2());
        f.setVisible(true);
        f.setResizable(false);
    }

}