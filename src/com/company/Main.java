package com.company;

import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args) {
	// write your code here
        triangle tri = new triangle(1, 2, 3, 4, 5, 6);
        rectangle sq = new rectangle(4, 4, 4);
        circle circ = new circle(4, 10, 4);
        System.out.println(sq.getOmkreds());
        System.out.println(sq.getAreal());
        System.out.println(sq.findCenter());
        System.out.println(sq.isInShape(4, 4));
        System.out.println(sq.getDistance(7,7));
        System.out.println(tri.getAreal());
        System.out.println(tri.getOmkreds());
        System.out.println(tri.findCenter());
        System.out.println(sq.getDistance(tri.center.x, tri.center.y));

        System.out.println(tri.getDistance(sq.center.x, sq.center.y));
        System.out.println(tri.getDistance(circ.center.x, circ.center.y));
        System.out.println(circ.isInShape(circ.center.x, circ.center.y));
        System.out.println(circ.isInShape(10000, 10000));
        System.out.println(tri.isInShape(1, 1));
        System.out.println(circ.getOmkreds());
        System.out.println(circ.getAreal());

    }
}
