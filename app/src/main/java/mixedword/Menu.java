package main.java.mixedword;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu {
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Arial", Font.BOLD, 80);
    Font normaltext = new Font("Arial", Font.PLAIN, 28);
    JButton startButton;

    public Menu() {
        window = new JFrame();
        window.setSize(1500, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.GRAY);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 50, 1225, 100);
        titleNamePanel.setBackground(Color.GRAY);
        titleNameLabel = new JLabel("MIXED WORDS");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(600, 250, 200, 100);
        startButtonPanel.setBackground(Color.GRAY);

        startButton = new JButton("START");
        startButton.setBackground(Color.GRAY);
        startButton.setForeground(Color.black);
        startButton.setFont(normaltext);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }
}
