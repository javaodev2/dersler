package com.example.ders4;

public class RasgeleToplam {

    public static void main(String[] args) {


        int toplam = 0;
        for (int i = 10; i > 0; i--) {
            int sayi = (int) (Math.random() * 100);
            System.out.println("" + sayi);

            toplam = toplam + sayi;
        }
        System.out.println("toplam: " + toplam);


        long carpim = 1;
        for (int i = 10; i > 0; i--) {
            int sayi = (int) (Math.random() * 100);
            System.out.println("" + sayi);

            carpim = carpim * sayi;
        }
        System.out.println("carpim: " + carpim);


        int yeniToplam = 0;
        for (int i = 1; i < 11; i++) {
            int sayi = (int) (Math.random() * 10);
            System.out.println("" + sayi);
            yeniToplam = yeniToplam + sayi;

            if (yeniToplam > 20) { // toplam 20'yi geçerse döngüyü kır
                System.out.println("dongu " + i);
                break;
            }
        }
        System.out.println("toplam: " + yeniToplam);

    }
}
