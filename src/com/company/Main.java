package com.company;

import java.util.function.Function;

public class Main {

    public static void Range(Function<Double, Double> f) {
        for(double i = 0; i<=100; i++)
            System.out.println(f.apply(i));
    }


    public static void main(String[] args) {

    }
}
