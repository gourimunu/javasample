package com.sample.gouri.designpattern.AbstractFactoryPattern;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}