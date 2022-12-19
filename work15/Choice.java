package work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choice extends JFrame {
    String[] items = {
            "Australia",
            "China",
            "England",
            "Russia"
    };
    Choice() {
        super("Выбор");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250, 150);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String) box.getSelectedItem();
                switch (item) {
                    case "Australia":
                        JOptionPane.showMessageDialog(null, "Это не Австрия.", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "China":
                        JOptionPane.showMessageDialog(null, "Китай - древняя страна с интересной культурой. А ещё они пытаются в коммунизм.", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "England":
                        JOptionPane.showMessageDialog(null, "Англия - нет, не Великобритания - один из четырех регионов Соединенного Королевства.", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Russia":
                        JOptionPane.showMessageDialog(null, "Россия (Российская Федерация) - страна северного полушария, в которой можно найти разные климатические зоны.", "Инфо", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(actionListener);
        add(comboBox);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Choice();
    }
}
