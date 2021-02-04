package bitlab.askar.module2.lesson6.lab2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("app");
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JLabel label = new JLabel("#");
        label.setLocation(100,100);
        label.setSize(30,30);
        add(label);


        JButton button = new JButton("FIRE");
        button.setLocation(400,100);
        button.setSize(30,300);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MyThread thread = new MyThread(label);
                thread.start();

            }
        });


        add(button);

    }
}
