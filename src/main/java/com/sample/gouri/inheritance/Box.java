package com.sample.gouri.inheritance;

class Box {
    public double width;
    public double height;
    public double depth;
    // construct clone of an object
    public Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified
    public Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    public Box(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    public double volume() {
        return width * height * depth;
    }
}