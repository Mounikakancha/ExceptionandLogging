package com.mycompany.log;
import java.lang.Math.*;
public class CalculateCompound {
    double calCompound(double amount,double rate,double time)
    {
        return amount*Math.pow((1+rate/12),time);
    }
    
}
