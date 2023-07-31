
package com.mycompany.calculatearea;

public class rectangle
{
    private int width,height;
    
    public void calculateRec(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    public int diplay()
    {
        return width*height;
    }
}
