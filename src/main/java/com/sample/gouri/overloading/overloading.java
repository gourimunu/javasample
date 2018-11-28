package com.sample.gouri.overloading;

public class overloading {

    public String Name;
    public String Address;

    public overloading(String N, String A)
    {
        Name = N;
        Address = A;
    }

    public overloading(String N)
    {
        Name = N;
        Address = "Address";
    }

    public String test()
    {
        return Name + Address;
    }

    public String test(String var)
    {
        return Name=var;
    }

    public String test(String a, String b)
    {
        Name =a;
        Address=b;
        return Name+Address;
    }
}
