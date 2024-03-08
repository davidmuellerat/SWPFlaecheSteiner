package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Form[] formen = new Form[10];

        //da Form nun abstarct ist kann keine Instanz davon erzeugt werden
        //Form form1 = new Form(40,20);

        Quadrat quadrat1 = new Quadrat(50, 50, 100, 100);
        Viereck viereck1 = new Viereck(150, 150, 30, 70);
        Kreis kreis1 = new Kreis(200, 200, 80);

        formen[0] = quadrat1;
        formen[1] = viereck1;
        formen[2] = kreis1;

        int i = 0;
        while (formen[i] != null && i < 10)
        {
            System.out.println(formen[i].berechneFläche());
            System.out.println(formen[i].berechneUmfang());
            i++;
        }
    }
}