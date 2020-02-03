package com.example.ders2;

import java.util.Scanner;

public class Oyun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        // 1 ile 100 arasında bir rastgele bir sayı üretir
        int sayi = (int) (Math.random() * 100);

        int hak = 5; // toplam 5 tahmin hakkı vardır
        while (hak > 0) { // hak 0'dan büyük olduğu sürece aşağıdaki kodu tekrar tekrar çalıştır
            String tahmin = input.nextLine(); // kullanıcı bir sayı girer
            int tahminSayi = Integer.valueOf(tahmin); // Girilen sayı Integer tipine dönüştürülür

            if (sayi < tahminSayi) {
                System.out.println("daha küçük bir sayi soyle");
            } else if (sayi > tahminSayi) {
                System.out.println("daha buyuk bir sayi soyle");
            } else {
                System.out.println("tebrikler");
                break; // Tahmin edilen sayı bil
            }

            hak--; // Hak 1 azaltılır
            if (hak == 0){ // Eğer hak 0 olduysa oyun bitirilir
                System.out.println("Oyun bitti");
            }
        }
    }
}
