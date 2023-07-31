
package com.mycompany.calculatearea;

public abstract class Shape
{
    
    abstract  double calculateArea();
    
    public void display()
    {
        System.out.println("Area"+calculateArea());
    }
    
}
