package work16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Guesser extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Guesser");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (y < 100)
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в САО", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                else if (y < 200) {
                    if (x < 100)
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                    else if (x < 200)
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО", "Инфо", JOptionPane.INFORMATION_MESSAGE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Конец", "Инфо", JOptionPane.INFORMATION_MESSAGE);
            }
        };
        frame.addMouseListener(mouseListener);
        frame.setVisible(true);
    }
}
