package com.company;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.awt.*;

class circleTest {
    circle circ1 = new circle(3,9,20);
    @Test
    void findCenterTest() {
        // compares .x
        assertEquals(circ1.findCenter().x,new Point(9,20).x);
        assertEquals(circ1.findCenter().y,new Point(9,20).y);
    }
    @Test
    void getOmkreds() {
        assertEquals(circ1.getOmkreds(),18,0.78);
    }

    @Test
    void getAreal() {
    }
}