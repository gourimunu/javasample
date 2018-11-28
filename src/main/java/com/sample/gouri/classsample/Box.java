package com.sample.gouri.classsample;

public class Box {
    public double width;
    public double height;
    public double depth;

    public Box(double a, double b, double c)
    {
        this.width = a;
        this.height = b;
        this.depth = c;
    }
    public double volume()
    {
        return width * height * depth;
    }

    public void setDim(double x, double y, double z){
        width = x;
        height = y;
        depth = z;
    }
}


