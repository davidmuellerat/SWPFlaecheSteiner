package org.example;

import static org.junit.Assert.*;

public class KreisTest {

    @org.junit.Test

    public void testBerechneUmfang() {
        Kreis kreis = new Kreis(0, 0, 5);
        double erwarteterUmfang = 2 * 5 * Math.PI;
        assertEquals(erwarteterUmfang, kreis.berechneUmfang(), 0.001);
    }

    @org.junit.Test
    public void testBerechneFlaeche() {
        Kreis kreis = new Kreis(0, 0, 5);
        double erwarteteFlaeche = Math.PI * Math.pow(5, 2);
        assertEquals(erwarteteFlaeche, kreis.berechneFläche(), 0.001);
    }
}