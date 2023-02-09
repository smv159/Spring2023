package CMPSC221;

import java.awt.Color;

public class Wheel {
    double diameter;
    Color color;
    double width;
    boolean hasSpinners;

    public Wheel(double diameter, Color color, double width, boolean hasSpinners) {
        this.diameter = diameter;
        this.color = color;
        this.width = width;
        this.hasSpinners = hasSpinners;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isHasSpinners() {
        return hasSpinners;
    }

    public void setHasSpinners(boolean hasSpinners) {
        this.hasSpinners = hasSpinners;
    }


}
