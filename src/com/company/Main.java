package com.company;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// write your code here
        triangle tri = new triangle(1, 2, 3, 4, 5, 6);
        square sq = new square(4, 4, 4);
        circle cir = new circle(4, 10, 4);
        System.out.println(sq.getOmkreds());
        System.out.println(sq.getAreal());
        System.out.println(sq.findCenter());
        System.out.println(sq.isInShape(4, 4));
        System.out.println(sq.get());
        System.out.println(sq.getDistance(7,7));
        System.out.println(tri.getAreal());
        System.out.println(tri.getOmkreds());
        System.out.println(tri.findCenter());
        System.out.println(sq.getDistance(tri.center.x, tri.center.y));

        System.out.println(tri.getDistance(sq.center.x, sq.center.y));
        System.out.println(tri.getDistance(cir.center.x, cir.center.y));
        System.out.println(cir.isInShape(cir.center.x, cir.center.y));
        System.out.println(cir.isInShape(10000, 10000));

    }
}

abstract class shapes{
    int areal;
    double omkreds;
    double distance;
    Point center;

    public abstract void shape();

    abstract Point findCenter();
    abstract boolean isInShape(int x, int y);
    abstract double getDistance(int x, int y);

        }

        class triangle extends shapes{
    int sLength;
    Point a;
    Point point1;
            Point point2;
            Point point3;
            int GL;
            int Height;
            Point center;
            @Override
            public void shape() {}
                public triangle(int x1, int y1, int x2, int y2, int x3, int y3){
                    this.point1 = new Point(x1, y1);
                    this.point2 = new Point(x2, y2);
                    this.point3 = new Point(x3, y3);
                    this.GL = x2 - x1;
                    this.Height = y3 - y1;
                }

                double getAreal(){
                this.areal = this.GL * this.Height /2;
                return  this.areal;
            }

            double getOmkreds(){
                //Bare sæt getDistance() ind, når den er skrevet ordentlig ind.
                double distance12 = Math.sqrt((this.point1.x - this.point2.x) * (this.point1.x - this.point2.x) + (this.point1.y - this.point2.y) * (this.point1.y - this.point2.y));
                double distance23 = Math.sqrt((this.point2.x - this.point3.x) * (this.point2.x - this.point3.x) + (this.point2.y - this.point3.y) * (this.point2.y - this.point3.y));
                double distance31 = Math.sqrt((this.point3.x - this.point1.x) * (this.point3.x - this.point1.x) + (this.point3.y - this.point1.y) * (this.point3.y - this.point1.y));
                omkreds = distance12 + distance23 + distance31;
                return omkreds;


            }



            @Override
            Point findCenter() {
                center=new Point((this.point1.x+this.point2.x+this.point3.x)/3, (this.point1.y+this.point2.y+this.point3.y)/3);
                return center;
            }

            @Override
            boolean isInShape(int x, int y) {
                //if(triangle.this.getDistance(x,y))
                return false;
            }

            @Override
            double getDistance(int x, int y) {
                double distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));

                return distance;
            }
        }
        class square extends shapes{
            int sLength;
            Point point1;
            Point point2;
            Point point3;
            Point point4;
            Point center;
            private int x;
            private int y;

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

            @Override
            Point findCenter() {
                this.center = new Point(this.point1.x + (sLength/2), this.point1.y + (sLength/2) );
                return this.center;
            }

            @Override
            boolean isInShape(int x, int y) {
                //if(p.x> ){ }
                if(x >= this.point1.x && x <= this.point2.x
                        && y >= this.point1.y && y <= this.point3.y
                ){
                    return true;
                }else {
                    return false;
                }
            }

            @Override
            double getDistance(int x, int y){
                double distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));

                return distance;
            }

            int get(){
                return this.point1.x;
            }

            double getOmkreds(){
                this.omkreds = sLength * 4;
                return this.omkreds;
            }
            int getAreal(){
                this.areal = sLength * sLength;
                return this.areal;
            }
        }
        class circle extends shapes{
    double radius;
    Point center;
    Point reachPoint;
    Point b;
            @Override
            public void shape() {
            }
            public circle(int radius, int xPoint, int yPoint){
                this.radius = radius;
                this.center = new Point(xPoint,yPoint);
                this.reachPoint = new Point(xPoint,yPoint);
            }

            @Override
            Point findCenter() {
                return this.center;
            }

            double getOmkreds(){
                this.omkreds = (int) (2 * Math.PI * this.radius);
                return this.omkreds;
            }

            double getAreal(){
                this.areal = (int) (Math.PI * Math.sqrt(this.radius));
                return this.areal;
            }

            @Override
            boolean isInShape(int x, int y) {
                //if(getdistance(xy, this.centerpoint)<radius)
                //return true, else return false
                if(circle.this.getDistance(x, y) < this.radius){
                    return true;
                } else{
                    return false;
                }
            }

            @Override
            double getDistance(int x, int y) {
                double distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));

                return distance;
            }

        }