package gui;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    private Homeview hw;

    public GUI(){
        super("A&B - by @tr4mo (Github)");
        setSize(641,384);
        setResizable(false);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        hw = new Homeview();

        getContentPane().add(hw);
        pack();
        setVisible(true);
    }
}
