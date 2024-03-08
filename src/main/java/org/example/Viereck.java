package org.example;

//Ein Viereck ist eine geometrische Form
public class Viereck extends Form
{
    private double länge;
    private double breite;

    public Viereck(int x, int y, double länge, double breite)
    {
        super(x, y);
        this.länge = länge;
        this.breite = breite;
    }
    public double berechneUmfang()
    {
        System.out.print("berechne Umfang Viereck: ");
        double umfang;
        umfang = 2 * this.länge + 2 * this.breite;
        return umfang;
    }

    public double berechneFläche()
    {
        System.out.print("berechne Fläche Viereck: ");
        double fläche;
        fläche = this.länge * this.breite;
        return fläche;
    }

    public double getLänge()
    {
        return länge;
    }

    public void setLänge(double länge)
    {
        this.länge = länge;
    }

    public double getBreite()
    {
        return breite;
    }

    public void setBreite(double breite)
    {
        this.breite = breite;
    }
}
