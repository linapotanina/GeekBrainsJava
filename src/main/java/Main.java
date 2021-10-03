import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    int counter = 0;

    public Main() {
        setTitle("First app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 600, 100);

        JLabel label = new JLabel();
        label.setText(String.valueOf(counter));

        setLayout(new GridLayout(1,4));


        JButton buttonMinus = new JButton("-");

        buttonMinus.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--; // counter = counter -1
                label.setText(String.valueOf(counter));
            }
        });

        JButton buttonPlus = new JButton("+");

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText(String.valueOf(counter));
            }
        });

        JButton resetButton = new JButton("Сброс");

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                label.setText(String.valueOf(counter));
            }
        });

        add(buttonMinus);
        add(label);
        add(buttonPlus);
        add(resetButton);



        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();

    }
}
