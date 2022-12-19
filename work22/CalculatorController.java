package work22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EmptyStackException;

public class CalculatorController extends JPanel
{
    JTextField textpos = null;


    public  CalculatorController()
    {
        try
        {
            setLayout(null);
            // Specifies the position of the element
            final TextField textpos = new TextField();
            textpos.setBounds(10, 10, 225, 30);

            JButton b0 = new JButton("0");
            b0.setBounds(10, 190, 50, 50);

            JButton b1 = new JButton("1");
            b1.setBounds(10, 140, 50, 50);

            JButton b2 = new JButton("2");
            b2.setBounds(60, 140, 50, 50);

            JButton b3 = new JButton("3");
            b3.setBounds(110, 140, 50, 50);

            JButton b4 = new JButton("4");
            b4.setBounds(10, 90, 50, 50);

            JButton b5 = new JButton("5");
            b5.setBounds(60, 90, 50, 50);

            JButton b6 = new JButton("6");
            b6.setBounds(110, 90, 50, 50);

            JButton b7 = new JButton("7");
            b7.setBounds(10, 40, 50, 50);

            JButton b8 = new JButton("8");
            b8.setBounds(60, 40, 50, 50);

            JButton b9 = new JButton("9");
            b9.setBounds(110, 40, 50, 50);

            Font biggerFont = new Font("serif", Font.BOLD, 22);

            JButton btnRes = new JButton("=");
            btnRes.setBounds(160, 190, 75, 50);

            JButton btnSum = new JButton("+");
            btnSum.setBounds(160, 40, 75, 50);

            JButton btnSubst = new JButton("-");
            btnSubst.setBounds(160, 90, 75, 50);

            JButton btnMul = new JButton("*");
            btnMul.setBounds(110, 190, 50, 50);
            btnMul.setFont(biggerFont);

            JButton btnDiv = new JButton("/");
            btnDiv.setBounds(160, 140, 75, 50);

            JButton btnSpace = new JButton(".");
            btnSpace.setBounds(60, 190, 50, 50);

            btnRes.setFont(biggerFont);
            btnSum.setFont(biggerFont);
            btnSubst.setFont(biggerFont);
            btnDiv.setFont(biggerFont);
            btnSpace.setFont(biggerFont);

            add(textpos);add(b0);add(b1);add(b2);
            add(b3);add(b4);add(b5);add(b6);
            add(b7);add(b8);add(b9);add(btnRes);
            add(btnSum);add(btnSubst);add(btnMul);add(btnDiv);add(btnSpace);

            b1.addActionListener(arg1 -> textpos.setText(textpos.getText() + 1));

            b2.addActionListener(arg1 -> textpos.setText(textpos.getText() + 2));

            b3.addActionListener(arg1 -> textpos.setText(textpos.getText() + 3));

            b4.addActionListener(arg1 -> textpos.setText(textpos.getText() + 4));

            b5.addActionListener(arg1 -> textpos.setText(textpos.getText() + 5));

            b6.addActionListener(arg1 -> textpos.setText(textpos.getText() + 6));

            b7.addActionListener(arg1 -> textpos.setText(textpos.getText() + 7));

            b8.addActionListener(arg1 -> textpos.setText(textpos.getText() + 8));

            b9.addActionListener(arg1 -> textpos.setText(textpos.getText() + 9));

            b0.addActionListener(arg1 -> textpos.setText(textpos.getText() + 0));

            btnSum.addActionListener(arg1 -> textpos.setText(textpos.getText() + " + "));

            btnSubst.addActionListener(arg1 -> textpos.setText(textpos.getText() + " - "));

            btnMul.addActionListener(arg1 -> textpos.setText(textpos.getText() + " * "));

            btnDiv.addActionListener(arg1 -> textpos.setText(textpos.getText() + " / "));

            btnRes.addActionListener(arg0 -> {
                Calculator calc = new Calculator();
                textpos.setText(calc.calc(textpos.getText()) + "");
            });

            btnSpace.addActionListener(arg0 -> textpos.setText(textpos.getText() + " "));
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Деление на ноль");
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println("Неверный параметр");
        }
        catch (EmptyStackException exception)
        {
            System.out.println("Пустой стэк");
        }
        catch (Exception exception)
        {
            System.out.println("Error");
        }
    }
}
