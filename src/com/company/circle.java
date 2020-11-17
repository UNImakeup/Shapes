package com.company;

import java.awt.*;

public class circle extends shapes {
    double radius;

    @Override
    public void shape() {
    }

    public circle(int radius, int xPoint, int yPoint) {
        this.radius = radius;
        this.center = new Point(xPoint, yPoint);
    }

    @Override
    public Point findCenter() {
        return this.center;
    }

    @Override
    public double getOmkreds() {
        this.omkreds = (int) (2 * Math.PI * this.radius);
        return this.omkreds;
    }

    @Override
    double getAreal() {
        this.areal = (int) (Math.PI * Math.sqrt(this.radius));
        return this.areal;
    }

    @Override
    boolean isInShape(int x, int y) {
        //if(getdistance(xy, this.centerpoint)<radius)
        //return true, else return false
        if (circle.this.getDistance(x, y) < this.radius) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    double getDistance(int x, int y) {
        distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));

        return distance;
    }
}