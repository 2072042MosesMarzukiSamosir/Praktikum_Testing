package com.example.tugaspraktikum_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoClassTest {

    @Test
    void returnNumber() {
        DemoClass demoClass = new DemoClass();
        double phi = Math.PI*100;
        assertEquals(phi,demoClass.returnNumber(5),"Should return phi value" );
    }
}