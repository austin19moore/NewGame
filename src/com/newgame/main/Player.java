package com.newgame.main;

import java.awt.*;

public class Player extends NGObject {


    public Player(int x, int y, ID id) {
        super(x, y, id);


    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(x, y, 32, 32);
    }

}
