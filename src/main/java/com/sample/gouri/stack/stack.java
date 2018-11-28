package com.sample.gouri.stack;

public class stack {
    int stck[] = new int[10];
    int tos;

    public stack(){
        tos = -1;
    }

    public boolean push(int item){
        if (tos == 9)
            return false;
        else
            stck[++tos]=item;
        return true;
    }

    public int pop(){
        if (tos < 0)
            return 0;
        else
            return stck[tos--];
    }
}
