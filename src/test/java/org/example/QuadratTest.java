package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadratTest {
Viereck quadrat = new Quadrat(10,10,100,100);
    @Test
    void berechneUmfang() {
        assertEquals(400, quadrat.berechneUmfang(), 0.0);
    }

    @Test
    void berechneFläche() {
        assertEquals(100*100, quadrat.berechneFläche(), 0.0);
    }
}