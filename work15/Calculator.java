package work15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    JButton button0 = new JButton("Сложить");
    JButton button1 = new JButton("Вычесть");
    JButton button2 = new JButton("Поделить");
    JButton button3 = new JButton("Умножить");
    Font fnt = new Font("Times new roman", Font.PLAIN, 20);

    JTextField jtext1 = new JTextField(10);
    JTextField jtext2 = new JTextField(10);


    Calculator() {

        super("Калькулятор");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 200);


        add(new JLabel("Первое число:"));
        add(jtext1);

        add(new JLabel("Второе число:"));
        add(jtext2);

        add(button0);
        add(button1);
        add(button2);
        add(button3);

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jtext1.getText().trim());
                    double x2 = Double.parseDouble(jtext2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Сумма: " + (x1 + x2), "Итог", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jtext1.getText().trim());
                    double x2 = Double.parseDouble(jtext2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Разность: " + (x1 - x2), "Итог", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jtext1.getText().trim());
                    double x2 = Double.parseDouble(jtext2.getText().trim());
                    if(x2!=0) {
                        JOptionPane.showMessageDialog(null, "Частное: " + (x1 / x2), "Итог", JOptionPane.INFORMATION_MESSAGE);
                         } else {
                        JOptionPane.showMessageDialog(null, "Делим на ноль? Хм-м...", "Ошибка", JOptionPane.ERROR_MESSAGE);
                    }
                    } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jtext1.getText().trim());
                    double x2 = Double.parseDouble(jtext2.getText().trim());

                    JOptionPane.showMessageDialog(null, "Произведение: " + (x1 * x2), "Итог", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ошибка!", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    } // конец main()
}