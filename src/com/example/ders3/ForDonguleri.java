package com.example.ders3;

public class ForDonguleri {

    public static void main(String[] args) {

        // Birer birer 5'e kadar
        for (int i = 0; i < 5; i++) {
            System.out.println("Birer " + i);
        }
        System.out.println("-----------------");

        // Birer birer 9'dan sıfıra
        for (int j = 10; j > 0; j--) {
            System.out.println("Azalan " + j);
        }
        System.out.println("-----------------");

        // 0'dan 10'a ikişer artan
        for (int k = 0; k <= 10; k += 2) {
            System.out.println("Artan " + k);
        }
        System.out.println("-----------------");


        // 1'den 100'e 3'ün katları olan sayıları yazdır.
        for (int m = 1; m < 100; m++) {
            if (m % 3 == 0) {
                System.out.println("m = " + m);
            }
        }
        System.out.println("-----------------");

        // 1'den 100'e 3'ün katları olan sayıları yazdır.
        for (int m = 3; m < 100; m += 3) {
            System.out.println("m = " + m);
        }
        System.out.println("-----------------");

        // 1'den 100'e 3'ün katları olan sayıları yazdır.
        for (int m = 1; m <= 33; m++) {
            System.out.println("m = " + m * 3);
        }

    }
}
