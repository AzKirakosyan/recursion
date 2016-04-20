package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameSum extends JFrame implements ActionListener {

    private JButton button=new JButton("Ok");
    private JTextField text1=new JTextField(15);
    private JTextField text2=new JTextField(15);
    private JLabel label=new JLabel();

    public FrameSum(){

        setLayout(new FlowLayout());
        add(text1);
        add(text2);
        add(button);
        label.setPreferredSize(new Dimension(100,50));
        add(label);
        label.setText("anwer");
        button.addActionListener(this);


        setTitle("FrameSum");
        setSize(200,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {

            label.setText(Recursion.f(Integer.parseInt(text1.getText()), Integer.parseInt(text2.getText()))+"");
        }


    }
}
