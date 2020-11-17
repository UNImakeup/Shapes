package com.company.test_sources_root;

import com.company.circle;
import org.junit.Test;


import java.awt.*;

import static org.junit.Assert.assertEquals;

public class TestCircle {
    circle circ1 = new circle(3,9,20);
    circle circ = new circle(4, 10, 4);
    double omkreds = 25.0;


    @Test
    public void findCenterTest() {
        // compares .x
        assertEquals(circ1.findCenter().x,new Point(9,20).x);
        assertEquals(circ1.findCenter().y,new Point(9,20).y);
    }
    @Test
    public void testGetOmkreds() {
        //assertEquals(circ.getOmkreds(),25.0);
        assertEquals(circ.getOmkreds(), omkreds, 0);
    }

    @Test
    public void testgetAreal() {
        assertEquals(circ.getAreal(), 6, 0);



    }
}