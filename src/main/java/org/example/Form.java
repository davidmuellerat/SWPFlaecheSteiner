package org.example;

abstract public class Form
{
    //Koordinaten des linken oberen Punktes
    private int x;
    private int y;

    public Form(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    //Funktion muss in den Subklassen überschrieben werden
    abstract public double berechneUmfang();

    //Funktion muss in den Subklassen überschrieben werden
    abstract public double berechneFläche();

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
