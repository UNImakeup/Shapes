package com.company;


import java.awt.*;

abstract class shapes{
    int areal;
    double omkreds;
    double distance;
    Point center;

    public abstract void shape();

    abstract Point findCenter();
    abstract boolean isInShape(int x, int y);

    abstract double getDistance(int x, int y);
    abstract double getOmkreds();
    abstract double getAreal();


}