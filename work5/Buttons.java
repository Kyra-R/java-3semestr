package work5;

import javax.swing.*;
import java.awt.event.*;

public class Buttons extends JFrame
{
    int countMilan=0;
    int countRM=0;
    private JButton button1, button2;
    private JLabel label;
    private JLabel lastWin;

    private JLabel winner;
    public static void main(String[] args) {
        new Buttons();
    }
    public Buttons()
    {
        this.setSize(350,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Football");
        this.setLayout(null);
        Clicklistener click = new Clicklistener();
        button1 = new JButton ("AC Milan");
        button1.setBounds(10,100,150,40);
        button1.addActionListener(click);
        button2 = new JButton ("Real Madrid");
        button2.setBounds(170,100,150,40);
        button2.addActionListener(click);

        label = new JLabel();
        label.setBounds(110,150,150,20);
        label.setText("Result: 0 X 0");

        lastWin = new JLabel();
        lastWin.setBounds(110,180,150,20);
        lastWin.setText("Last Scorer: N/A");

        winner = new JLabel();
        winner.setBounds(110,210,150,20);
        winner.setText("Winner: DRAW");
        this.add(button1);
        this.add(button2);
        this.add(label);
        this.add(lastWin);
        this.add(winner);
        this.setVisible(true);
    }

    private class Clicklistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == button1)
            {
                countMilan+=1;
                label.setText("Result: "+countMilan+" X "+countRM);
                lastWin.setText("Last Scorer: AC Milan");
            }

            if (e.getSource() == button2)
            {
                countRM+=1;
                label.setText("Result: "+countMilan+" X "+countRM);
                lastWin.setText("Last Scorer: Real Madrid");
            }
            if(countRM> countMilan){
                winner.setText("Winner: Real Madrid");
            }
            else if (countRM < countMilan) {
                winner.setText("Winner: AC Milan");
            } else {
                winner.setText("Winner: None");
            }
        }
    }
}