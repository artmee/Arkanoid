package ru.nsu.g.akononov.arkanoid.model.components;

import java.awt.*;

public abstract class ObjectArea {
    protected Rectangle area;

    public int getX() {
        return area.x;
    }

    public int getY() {
        return area.y;
    }

    public int getHeight() {
        return area.height;
    }

    public int getWidth() {
        return area.width;
    }

    public Rectangle getArea()
    {
        return area;
    }
}
