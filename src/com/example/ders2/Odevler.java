package com.example.ders2;

public class Odevler {

    public static void main(String[] args) {
        // Odev 5
        /*Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        String kilo = input.nextLine();

        System.out.println("Boyunuzu giriniz (cm)");
        String boy = input.nextLine();

        System.out.println("kilonuz " + kilo + " boy " + boy);

        float kiloDeger = Float.valueOf(kilo);
        float boyDeger = Float.valueOf(boy);

        float sonuc = (kiloDeger / (boyDeger * boyDeger)) * 10000;

        System.out.println("Vucut kitle endeksiniz: " + sonuc);*/

        // Odev 6

        /*System.out.println("Kullandığınız ehliyet tipi nedir?");
        Scanner input = new Scanner(System.in);
        String ehliyet = input.nextLine();

        switch (ehliyet) {
            case "a":
                System.out.println("motorsiklet");
                break;
            case "b":
                System.out.println("hafif araç");
                break;
            case "c":
            case "d":
                System.out.println("iş makinası");
                break;
            default:
                System.out.println("böyle bir ehliyet tipi yoktur.");

        }*/

        // Odev7
        /*Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle = input.nextLine();
        System.out.println("Bu cümlede " + cumle.length() +" adet karakter bulunmaktadır.");
        String[] liste = cumle.split(" ");
        System.out.println("bu cumlede " + liste.length + " adet kelime bulunmaktadır.");*/

        int sayi1 = 5;
        int sayi2 = 12;


        sayi1++;
        sayi1--;

        sayi1 = sayi1 + 5;
        sayi1 += 5;

        sayi1 -= 4;

        sayi1 *= 3;

        System.out.println("sayi1 " + sayi1);

        System.out.println("mod " + (sayi2 % sayi1));

        if (sayi1 == 12 || sayi2 > 20) {
            System.out.println("sayi1 12 den kucuktur");

        }
    }
}