package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Game extends JFrame
{
    JTextField jta = new JTextField(10);
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    JButton btnConfirm = new JButton("Confirm");

    int tryCount = 3;

    Game() {
        super("Game");
        setLayout(new FlowLayout());
        setSize(2500,1000);

        add(jta);
        jta.setForeground(Color.PINK);
        jta.setFont(fnt);

        add(btnConfirm);
        btnConfirm.setFont(fnt);

        int aimNum = (int) (Math.random() * 20);

        btnConfirm.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    int enteredNum = Integer.parseInt(jta.getText().trim());
                    tryCount--;
                    if (tryCount >= 0)
                        if (enteredNum != aimNum)
                            if (enteredNum > aimNum)
                                JOptionPane.showMessageDialog(null, "Вы ввели число " + enteredNum + ". Загаданное число меньше. " +
                                        "Осталось попыток: " + tryCount + ".", "Info", JOptionPane.INFORMATION_MESSAGE);
                            else
                                JOptionPane.showMessageDialog(null, "Вы ввели число " + enteredNum + ". Загаданное число больше. " +
                                        "Осталось попыток: " + tryCount + ".", "Info", JOptionPane.INFORMATION_MESSAGE);
                        else {
                            JOptionPane.showMessageDialog(null, "Поздравляем! Вы угадали число!","Win",JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                            new Game();
                        }
                    else {
                        JOptionPane.showMessageDialog(null, "Вы не угадали число (загаданное число: " + aimNum + ").", "Game over", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        new Game();
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Game();
    }
}