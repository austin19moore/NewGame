package com.newgame.main;

import javax.swing.*;
import java.awt.*;

public class Frame extends Canvas {

    private static final long serialVersionUID = 0;

    public Frame(int width, int height, String title, Builder builder) {
        JFrame frame = new JFrame();

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(builder);
        frame.setVisible(true);
        builder.start();
    }

}
