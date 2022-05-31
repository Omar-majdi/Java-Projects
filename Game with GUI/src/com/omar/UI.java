package com.omar;

import javax.swing.*;
import java.awt.*;

public class UI {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLapel, hpNumberLapel, weaponLapel, weaponNameLapel;
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public void createUI(Main.ChoiceHandler cHandler) {

        // Window
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        // Title Screen
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 500);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("Start");
        startButtonPanel.add(startButton);
        window.add(titleNamePanel);
        window.add(startButtonPanel);

        // GAME SCREEN
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("This is the main text area");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));
        window.add(choiceButtonPanel);

        choice1 = new JButton("choice1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("C1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("choice1");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("C2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("choice1");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("C3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("choice1");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("C4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1, 4));
        window.add(playerPanel);

        hpLapel = new JLabel("HP:");
        hpLapel.setFont(normalFont);
        hpLapel.setForeground(Color.white);
        playerPanel.add(hpLapel);
        hpNumberLapel = new JLabel();
        hpNumberLapel.setForeground(Color.white);
        hpNumberLapel.setFont(normalFont);
        playerPanel.add(hpNumberLapel);
        weaponLapel = new JLabel();
        weaponLapel.setForeground(Color.white);
        weaponLapel.setFont(normalFont);
        playerPanel.add(weaponLapel);
        weaponNameLapel = new JLabel();
        weaponNameLapel.setForeground(Color.white);
        playerPanel.add(weaponNameLapel);
        window.setVisible(true);




    }
}
