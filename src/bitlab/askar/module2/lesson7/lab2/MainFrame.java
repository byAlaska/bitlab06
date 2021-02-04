package bitlab.askar.module2.lesson7.lab2;

import bitlab.askar.module2.lesson2.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    public MainFrame(){

        setTitle("APP");
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        JTextField field = new JTextField();
        field.setSize(30,200);
        field.setLocation(200,100);
        add(field);

        JButton button = new JButton("SEND");
        button.setLocation(200,300);
        button.setSize(30,200);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client.sendMessage(field.getText());
            }
        });
        add(button);


    }
}
