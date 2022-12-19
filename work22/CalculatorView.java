package work22;

import javax.swing.*;

public class CalculatorView extends JFrame
{
    public CalculatorView()
    {
        setBounds(100, 100, 260, 300);
        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add( new CalculatorController());
        setVisible(true);
    }
}
