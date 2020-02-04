package com.example.ders1;

import java.util.Scanner;

public class KullaniciGirdisi {


    public static void main(String[] args) {

        String isim = "";
        int deneme = 0;

        while (isim.equals("") && deneme < 3) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen adınızı giriniz:");

            // Kullanicinin girdigi bilgi isim değişkenine atanır
            isim = input.nextLine();

            // Eğer isim girmeden enter'a bastıysa boş giremezsiniz uyarısı verir.
            if (isim.equals("")) {
                System.out.println("Boş giremezsiniz. tekrar girin");
                deneme = deneme + 1;
            } else {
                System.out.println("Merhaba " + isim);
            }
        }
        System.out.println("kod bitti");

    }

}
