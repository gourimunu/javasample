package com.sample.gouri.sample;

import com.sample.gouri.UseStatic.usestatic;
import com.sample.gouri.classsample.*;
import com.sample.gouri.designpattern.AbstractFactoryPattern.AbstractFactory;
import com.sample.gouri.designpattern.AbstractFactoryPattern.Color;
import com.sample.gouri.designpattern.AbstractFactoryPattern.FactoryProducer;
import com.sample.gouri.designpattern.SingletonPattern.SingleObject;
import com.sample.gouri.inheritance.A;
import com.sample.gouri.inheritance.BoxWeight;
import com.sample.gouri.inheritance.inheritance;
import com.sample.gouri.overloading.overloading;
import com.sample.gouri.stack.*;
import com.sample.gouri.recursion.*;
import com.sample.gouri.overriding.*;
import com.sample.gouri.designpattern.FactoryPattern.*;


import com.sample.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //FactoryPattern();
        //samples2();
        //AbstractFactorySample();
        SingletonPattern();

    }

    private static void SingletonPattern(){
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }

    private static void  AbstractFactorySample(){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        com.sample.gouri.designpattern.AbstractFactoryPattern.Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        com.sample.gouri.designpattern.AbstractFactoryPattern.Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        com.sample.gouri.designpattern.AbstractFactoryPattern.Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");

        color1.fill();

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        color3.fill();
}

    private static void FactoryPattern(){
        ShapeFactory sf = new ShapeFactory();
        Shape circle = sf.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = sf.getShape("RECTANGLE");
        rectangle.draw();

        Shape  squre = sf.getShape("SQUARE");
        squre.draw();

        Shape  nothing = sf.getShape("Nothing");
        nothing.draw();

    }

    private static void samples2(){
        overriding1 ove1 = new overriding1();
        overriding2 ove2 = new overriding2();
        overriding3 ove3 = new overriding3();

        overriding1 A;

        A = ove1;


        A.callme();

        A = ove2;

        A.callme();

        A = ove3;

        A.callme();

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); // default
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();

        A a = new A();
        a.i = 10;
        a.j = 78;
        a.showij();
        inheritance I = new inheritance();
        I.k = 10;
        I.i=10;
        I.j = 10;
        I.sum();
    }

    private void Samples() {
        System.out.println("Hello World!");

        int x, y;
        x = 234;
        y = 90;

        if (x > y)
            System.out.println("X Greater");
        else
            System.out.println("Y is Greater");

        for (x = 0; x < 10; x = x + 1) {
            System.out.println(x);
        }

        double pi, r, area;
        r = 10.8;
        pi = 3.1416;
        area = pi * r * r;
        System.out.println("Area of circle is " + area);

        char ch1, ch2;
        ch1 = 66;
        ch2 = 90;

        System.out.println(ch1);
        System.out.println(ch2);

        boolean c;
        c = true;
        System.out.println(c);

        int val = 123___454;

        System.out.println(val);

        System.out.println("\r Gouri \t Prasad \tMahapatra");


        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Int to Byte");
        b = (byte) i;
        System.out.println(b);
        System.out.println("Double to Int");
        i = (int) d;
        System.out.println(i);
        System.out.println("Double to Byte");
        b = (byte) d;
        System.out.println(b);

        byte aa = 40;
        byte bb = 50;
        byte cc = 89;

        int dd = aa * bb / cc;
        System.out.println(dd);

        //Array : One Dimentional
        int month_days[];
        month_days = new int[12];
        month_days[1] = 28;
        System.out.println(month_days[1]);
        int m_days[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Multi dimentional Array

        int two[][] = new int[4][4];
        two[1][1] = 34;
        System.out.println(two[1][1]);

        for (int xx = 0; xx < 4; xx++)
            for (int yy = 0; yy < 4; yy++)
                two[xx][yy] = xx + yy;

        for (int xx = 0; xx < 4; xx++) {
            System.out.println();
            for (int yy = 0; yy < 4; yy++)
                System.out.print(two[xx][yy] + " ");


            int aaa = 0;
            System.out.println("aaa++" + aaa++);
            System.out.println("++aaa" + ++aaa);

            int iii, uuu, iui;
            iii = uuu = iui = 100;

            iii = uuu == 0 ? 0 : 56 / 56;

            for (int m = 0; m < 10; m++)
                switch (m) {
                    case 0:
                        System.out.println("i" + i);
                        break;
                    case 1:
                        System.out.println("i" + i);
                        break;
                }
            int n = 90;
            while (n > 0) {
                System.out.println(n);
                n--;
            }

            do {
                System.out.println(n);
            } while (--n > 0);

            int nums[] = {1, 3, 4, 5, 6, 7, 8, 9};
            int val1 = 5;
            boolean found = false;
            for (int xy : nums) {
                if (xy == val1) {
                    found = true;
                    break;
                }
            }

            System.out.println(found);

            Box mybox = new Box(5, 6, 7);
//            mybox.width = 10;
//            mybox.height = 20;
//            mybox.depth = 15;

            //mybox.setDim(34,34,45);
            System.out.println("Volume : " + mybox.width * mybox.depth * mybox.height);

            System.out.println(mybox.volume());

            stack stk = new stack();
            System.out.println("Stack Push");
            for (int inc = 0; inc < 9; inc++)
                if (!stk.push(inc)) break;
            System.out.println("Stack Pop");
            for (int inc = 0; inc < 9; inc++)
                System.out.println(stk.pop());

            System.out.println("Overloading");
            overloading ol = new overloading("aasd");
            System.out.println(ol.test());
            System.out.println(ol.test("gsdgdgds"));
            System.out.println(ol.test("aSDASD", "sfsf fs f"));

            Recursion rr = new Recursion();
            System.out.println(rr.fact(10));

            usestatic.meth(343);
        }
    }
}