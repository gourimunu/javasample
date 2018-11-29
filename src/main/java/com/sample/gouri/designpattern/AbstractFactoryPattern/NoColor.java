package com.sample.gouri.designpattern.AbstractFactoryPattern;

public class NoColor implements Color {

    @Override
    public void fill() {
        System.out.println("Inside NO Color::fill() method.");
    }
}