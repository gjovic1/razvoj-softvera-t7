package com.company;

import java.util.function.Function;

public class PrviZadatak {

    public static void Range(Function<Double, Double> f) {
        for(double i = 0; i<=100; i++)
            System.out.println(f.apply(i));
    }


    public static void main(String[] args) {
        Range(x -> 4*x*x+3*x+5);
    }
}
