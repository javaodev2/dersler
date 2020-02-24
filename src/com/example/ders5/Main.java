package com.example.ders5


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi = sayiGirisi("ilk sayi:");
        int sayi2 = sayiGirisi("ikinci sayi:");

        mesaj("toplam: " + (sayi + sayi2));

        rasgele();

    }

    public static void mesaj(String metin){
        System.out.println(metin);
    }

    public static int sayiGirisi(String mesaj){
        Scanner input = new Scanner(System.in);
        System.out.println(mesaj);
        String sayi = input.nextLine();
        return Integer.valueOf(sayi);
    }

    public static void rasgele(){
        int sayi = (int) (Math.random() * 100);
        System.out.println("rasgele: " + sayi);
    }
}
