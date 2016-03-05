package org.fasttrackit.util;

/**
 * Created by Ioana on 03.03.2016.
 */
public class Calc {

    public double maxnumber;
    public Calc(int maxlengh) {
    maxnumber=Math.pow(10,maxlengh);
    }

    public  double add(int a, int b) {
        double s=a+b;
        if(s>maxnumber)
        {
            System.out.println(" sum was " + 3);
            s=maxnumber-1;
        }
        return s;
    }

}
