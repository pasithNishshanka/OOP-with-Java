
package com.mycompany.calculatearea;

public class Circle
{
    private double ra;
    static final double pi=3.14;
    
    public void calculateArea(double ra)
    {
        this.ra=ra;
    }
    public double diplay()
    {
        return ra*ra*pi;
    }
    
}
