package work16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuesser extends JFrame implements ActionListener {
    private int randomNumber;
    private int attempt = 3;

    private JLabel resultLabel;
    private JLabel attemptLabel;
    private JTextField textField;
    private JButton btn;


    @Override
    public void actionPerformed(ActionEvent e) {
        if (attempt <= 0) return;

        attempt--;
        if (attempt <= 0) {
            resultLabel.setText("Out of attempts");
            attemptLabel.setText("Attempts left: " + attempt);
            return;
        }

        int input = textField.getText().isEmpty() ? 0 : Integer.parseInt(textField.getText());

        if (input < randomNumber) {
            resultLabel.setText("Number is bigger than that");
        } else if (input > randomNumber) {
            resultLabel.setText("Number is lesser than that");
        } else {
            resultLabel.setText("Success!");
        }

        attemptLabel.setText("Attempts left: " + attempt);
    }

    public NumberGuesser() {
        super("Guess the number");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        randomNumber = (int) (Math.random() * 100) % 21;

        // Text Field Panel
        JPanel textFieldPanel = new JPanel();

        textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.Y_AXIS));
        textFieldPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(300, 50));
        textField.setFont(new Font("Verdana", Font.PLAIN, 16));
        textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textFieldPanel.add(textField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        btn = new JButton("Guess");
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.addActionListener(this);

        resultLabel = new JLabel();
        resultLabel.setText("Figure out the number");
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        attemptLabel = new JLabel();
        attemptLabel.setText("Attempts left: " + attempt);
        attemptLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonPanel.add(btn);
        buttonPanel.add(resultLabel);
        buttonPanel.add(attemptLabel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(textFieldPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.PAGE_END);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGuesser();
    }

}
