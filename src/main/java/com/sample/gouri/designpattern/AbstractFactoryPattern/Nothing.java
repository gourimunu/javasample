package com.sample.gouri.designpattern.AbstractFactoryPattern;

public class Nothing implements Shape {

    @Override
    public void draw() {
        System.out.println("Nothing draw");
    }
}