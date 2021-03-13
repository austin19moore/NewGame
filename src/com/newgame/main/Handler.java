package com.newgame.main;

import java.awt.*;
import java.util.LinkedList;

public class Handler {

    LinkedList<NGObject> object = new LinkedList<NGObject>();

    public void tick() {

        for(int i = 0; i < object.size(); i++) {
            NGObject currObject = object.get(i);

            currObject.tick();
        }

    }

    public void render(Graphics g) {

        for(int i = 0; i < object.size(); i++) {
            NGObject currObject = object.get(i);

            currObject.render(g);
        }

    }

    public void addObject(NGObject object) {

        this.object.add(object);

    }

    public void removeObject(NGObject object) {
        this.object.remove(object);
    }

}