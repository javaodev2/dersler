package com.example.ders1;

public class DegiskenTanimlama {

    public static void main(String[] args) {

        // bu kisinin yaşını ifade eder
        byte yas = 40;

        String ad = "Faruk";


        // Virgüllü sayı
        double oran = 1.12;

        // boolean evet veya hayır ifade eder
        boolean b1 = false;
        boolean b2 = true;


        System.out.println(ad.toLowerCase().toLowerCase());
        System.out.println("Merhaba benim yaşım " + yas + " adım " + ad + " oran " +oran);

        yas = 50;
        System.out.println("Merhaba benim yasim " + ad.substring(2,4).toUpperCase());

        System.out.println(ad.replace("F","T").replace("u","ı"));
        System.out.println(ad+ad+"yas");

        System.out.println("-----------------");

        int a = 100;
        String b = "100";
        int c = Integer.valueOf(b);

        System.out.println("esit mi " + (c == a));
    }
}
