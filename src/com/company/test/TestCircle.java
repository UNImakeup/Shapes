package com.company.test;

import com.company.circle;
import org.junit.Test;


import java.awt.*;

import static org.junit.Assert.assertEquals;

class TestCircle {
    circle circ1 = new circle(3,9,20);
    circle circ = new circle(4, 10, 4);
    double omkreds = 25.0;


    @Test
    void findCenterTest() {
        // compares .x
        assertEquals(circ1.findCenter().x,new Point(9,20).x);
        assertEquals(circ1.findCenter().y,new Point(9,20).y);
    }
    @Test
    void testGetOmkreds() {
        //assertEquals(circ.getOmkreds(),25.0);
        assertEquals(circ.getOmkreds(), omkreds, 0);
    }

    @Test
    void getAreal() {


    }
}