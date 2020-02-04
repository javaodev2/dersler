package com.example.ders1;

public class IfKullanimi {

    public static void main(String[] args) {
        boolean ehliyet = true;
        int yas = 20;

        boolean torpil = true;

        // yas 18'den büyük ve ehliyet true ise bu deger true olur
        boolean ehliyetAlirMi = yas > 18 && ehliyet;

        if (ehliyetAlirMi) {
            if (torpil) {
                System.out.println("kesin alir");
            } else {
                System.out.println("Araba kullanabilir");
            }
        } else if (torpil) {
            System.out.println("alır");
        } else {
            System.out.println("alamaz");
        }

    }
}
