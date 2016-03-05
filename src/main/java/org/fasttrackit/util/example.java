package org.fasttrackit.util;

/**
 * Created by Ioana on 03.03.2016.
 */
public class example {

    public static void main(String[] args) {
        System.out.println("the program has been started");
        Calc calc = new Calc(3);

        double suma=calc.add(567,876);
        System.out.println(suma);



        suma =calc.add(3,50);
        System.out.println(suma);
    }
}
