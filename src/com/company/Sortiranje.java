package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Sortiranje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Koliko želite unijeti brojeva ?");
        int brbr = s.nextInt();
        int [] arr = new int[brbr];
        System.out.println("Unesite brojeve:");

        for (int i = 0; i<brbr; i++){
            arr[i]  = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        
    }
}