package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        triangle tri = new triangle();
        square sq = new square(4, 4, 4);
        tri.findCenter(2);
        System.out.println(tri.findCenter(2));
        System.out.println(sq.getOmkreds());
        System.out.println(sq.getAreal());
        System.out.println(sq.returnPoint());


    }
}

abstract class shapes{
    int areal;
    int omkreds;

    public abstract void shape();

    abstract int findCenter(int a);
    abstract boolean isInShape(Point p);


        }

        class triangle extends shapes{
    int sLength;

            @Override
            public void shape() {

            }

            @Override
            int findCenter(int a) {
                return 0;
            }

            @Override
            boolean isInShape(Point p) {
                return false;
            }
        }
        class square extends shapes{
            int sLength;
            Point point1;
            Point point2;
            Point point3;
            Point point4;

            // Kunne måske være smart med noget a la; return (point + b);


            @Override
            public void shape() {
            }
            public square(int sLength, int xStart, int yStart){
                this.sLength = sLength;
                this.point1 = new Point(xStart, yStart);
                this.point2 = new Point((xStart + sLength), yStart);
                this.point3 = new Point(xStart,(yStart + sLength));
                this.point4 = new Point((xStart + sLength),(yStart + sLength));
        }
        Point returnPoint(){
                return point1;
        }

            @Override
            int findCenter(int a) {
                int startPoint = a;
                int center = startPoint + sLength;

                return 0;
            }

            @Override
            boolean isInShape(Point p) {
                //if(p.x> ){ }
                return false;
            }

            int getOmkreds(){
                omkreds = sLength * 4;
                return omkreds;
            }
            int getAreal(){
                areal = sLength * 2;
                return areal;
            }
        }
        class circle extends shapes{
    int radius;

            @Override
            public void shape() {

            }

            @Override
            int findCenter(int a) {
                return a;
            }

            @Override
            boolean isInShape(Point p) {
                return false;
            }

        }