package com.example.ders2;

public class Matematik {

    public static void main(String[] args) {

        double s = 2.4;
        double s2 = 2.6;

        // Yukarı yuvarlama
        System.out.println(Math.ceil(s));
        System.out.println(Math.ceil(s2));

        // Aşağı yuvarlama
        System.out.println(Math.floor(s));
        System.out.println(Math.floor(s2));

        //Yakın olana yuvarlama
        System.out.println(Math.round(s));
        System.out.println(Math.round(s2));
        System.out.println(Math.round(2.5));

        //Üslü sayi
        System.out.println(Math.pow(2, 3));

        // Büyük küçük
        System.out.println(Math.max(3,4));
        System.out.println(Math.min(3,4));

        // Random
        int sayi = (int) (Math.random() * 100);
        System.out.println(sayi);

    }
}
