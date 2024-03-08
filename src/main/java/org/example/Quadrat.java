package org.example;

//Ein Quadrat ist ein Viereck
public class Quadrat extends Viereck
{
    public Quadrat(int x, int y, double länge, double breite)
    {
        super(x, y, länge, breite);
    }

    public double berechneUmfang()
    {
        System.out.print("berechne Umfang Quadrat: ");
        double umfang;
        umfang = 4 * this.getLänge();
        return umfang;
    }

    public double berechneFläche()
    {
        System.out.print("berechne Fläche Quadrat: ");
        double fläche;
        fläche = this.getLänge() * this.getLänge();
        return fläche;
    }
}
