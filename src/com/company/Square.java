package com.company;


import java.awt.*;

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
        this.center = new Point(this.point1.x + (sLength/2), this.point1.y + (sLength/2) );
    }

    @Override
    public Point findCenter() {
        return this.center;
    }


    @Override
    public boolean isInShape(int x, int y) {
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
    public double getDistance(int x, int y){
        distance = Math.sqrt((x - this.center.x) * (x - this.center.x) + (y - this.center.y) * (y - this.center.y));

        return distance;
    }

    @Override
    public double getOmkreds(){
        this.omkreds = sLength * 4;
        return this.omkreds;
    }

    @Override
    public double getAreal(){
        this.areal = sLength * sLength;
        return this.areal;
    }
}