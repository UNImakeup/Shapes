package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        triangle tri = new triangle();
        square sq = new square(4, 4, 4);
        System.out.println(sq.getOmkreds());
        System.out.println(sq.getAreal());
        System.out.println(sq.returnPoint());
        System.out.println(sq.findCenter());
        System.out.println(sq.isInShape(4, 5));


    }
}

abstract class shapes{
    int areal;
    int omkreds;

    public abstract void shape();

    abstract Point findCenter();
    abstract boolean isInShape(int x, int y);


        }

        class triangle extends shapes{
    int sLength;
    Point a;

            @Override
            public void shape() {

            }

            @Override
            Point findCenter() {
            return this.a = new Point(2, 3) ;
            }

            @Override
            boolean isInShape(int x, int y) {
                return false;
            }
        }
        class square extends shapes{
            int sLength;
            Point point1;
            Point point2;
            Point point3;
            Point point4;
            Point center;

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
            Point findCenter() {
                this.center = new Point(this.point1.x + (sLength/2), this.point1.y + (sLength/2) );
                return this.center;
            }

            @Override
            boolean isInShape(int x, int y) {
                //if(p.x> ){ }
                if(x <= this.point1.x && x >= this.point2.x
                        && y <= this.point1.y && y >= this.point3.y){
                    return true;
                }else {
                    return false;
                }
            }

            int getOmkreds(){
                this.omkreds = sLength * 4;
                return this.omkreds;
            }
            int getAreal(){
                this.areal = sLength * 2;
                return this.areal;
            }
        }
        class circle extends shapes{
    int radius;
    Point b;
            @Override
            public void shape() {

            }

            @Override
            Point findCenter() {
                return this.b = new Point(2, 3);
            }

            @Override
            boolean isInShape(int x, int y) {
                return false;
            }

        }