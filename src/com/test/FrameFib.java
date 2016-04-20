package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameFib extends JFrame implements ActionListener{
    private JButton button=new JButton("Ok");
    private JTextField text=new JTextField(15);
    private JLabel label=new JLabel();

    public FrameFib() {

        setLayout(new FlowLayout());
        add(text);
        add(button);
        label.setPreferredSize(new Dimension(100,50));
        add(label);
        label.setText("anwer");
        button.addActionListener(this);

        setTitle("FrameFib");
        setSize(200,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button) {
            //String s= text.getText();
            //int n=Integer.parseInt(s);
            //int k=rec.fib(n);

            label.setText(Recursion.fib(Integer.parseInt(text.getText()))+"");
        }

    }
}
