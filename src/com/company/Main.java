package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        triangle tri = new triangle();
        square sq = new square();
        tri.findCenter(2);
        System.out.println(tri.findCenter(2));
        sq.setSides(4);
        System.out.println(sq.getOmkreds());
        System.out.println(sq.getAreal());
        System.out.println(sq.getPointsOfSquare(4));


    }
}

abstract class shapes{
    int areal;
    int omkreds;


    abstract int findCenter(int a);


        }

        class triangle extends shapes{
    int sLength;
            @Override
            int findCenter(int a) {
                return 0;
            }
        }
        class square extends shapes{
    int sLength;

            // Kunne måske være smart med noget a la; return (point + b);


            @Override
            int findCenter(int a) {
                int startPoint = a;
                int center = startPoint + sLength;

                return 0;
            }
            void setSides(int b){
                this.sLength = b;
            }

            void setStartPoint(int x, int y){
                Point a = new Point(x, y);
            }

            Point getPointsOfSquare(int b){
                Point a = new Point(3, 4);
                Point point1 = a;
                Point point2 = new Point((a.x + sLength), a.y);
                Point point3 = new Point(a.x, a.y + sLength);
                Point point4 = new Point(a.x + sLength, a.y + sLength);
                if(b == 1){
                    return point1;
                }
                if(b == 2){
                    return point2;
                }
                if(b == 3){
                    return point3;
                }
                if(b==4){
                    return point4;
                }else {
                    return point1;
                }

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
            int findCenter(int a) {
                return a;
            }
        }