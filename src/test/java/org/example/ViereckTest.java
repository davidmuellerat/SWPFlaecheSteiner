package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ViereckTest {
    Viereck viereck = new Viereck(10,5, 100,200);

    @org.junit.jupiter.api.Test
    void berechneUmfang() {
        assertEquals(600, viereck.berechneUmfang(), 0.0);
    }

    @org.junit.jupiter.api.Test
    void berechneFläche() {
        assertEquals(20000, viereck.berechneFläche(), 0.0);
    }
}