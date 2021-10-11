package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Game3 extends JFrame
{
    JTextField jta = new JTextField(10);
    Font fnt1 = new Font("Times new roman",Font.BOLD,20);
    Font fnt2 = new Font("Serif",Font.BOLD,20);
    Font fnt3 = new Font("Verdana",Font.BOLD,20);

    Font font = new Font("Verdana", Font.PLAIN, 11);

    Game3() {
        super("Game");
        setLayout(new FlowLayout());
        setSize(2500,1000);

        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt1);

        JMenuBar menuBar = new JMenuBar();


        JMenu mainMenu = new JMenu("Menu");
        mainMenu.setFont(font);

        //---------------------------------------------------
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setFont(font);
        mainMenu.add(colorMenu);

        JMenu fontMenu = new JMenu("Font");
        fontMenu.setFont(font);
        mainMenu.add(fontMenu);

        //--------------------------------------------------
        JMenuItem pinkFontItem = new JMenuItem("Pink");
        pinkFontItem.setFont(font);
        colorMenu.add(pinkFontItem);
        pinkFontItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.PINK);}
        });

        JMenuItem blackFontItem = new JMenuItem("Black");
        blackFontItem.setFont(font);
        colorMenu.add(blackFontItem);
        blackFontItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLACK);}
        });

        JMenuItem blueFontItem = new JMenuItem("Blue");
        blueFontItem.setFont(font);
        colorMenu.add(blueFontItem);
        blueFontItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLUE);}
        });



        JMenuItem TNRFontItem = new JMenuItem("Times New Roman");
        TNRFontItem.setFont(font);
        fontMenu.add(TNRFontItem);
        TNRFontItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setFont(fnt1);}
        });

        JMenuItem serifFontItem = new JMenuItem("Serif");
        serifFontItem.setFont(font);
        fontMenu.add(serifFontItem);
        serifFontItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setFont(fnt2);}
        });

        JMenuItem verdanaFontItem = new JMenuItem("Verdana");
        verdanaFontItem.setFont(font);
        fontMenu.add(verdanaFontItem);
        verdanaFontItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jta.setFont(fnt3);}
        });


        mainMenu.addSeparator();

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setFont(font);
        mainMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);}
        });

        menuBar.add(mainMenu);
        setJMenuBar(menuBar);

        setPreferredSize(new Dimension(270, 225));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Game3();
    }
}
