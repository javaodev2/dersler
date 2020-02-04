package com.example.ders1;

public class SwitchCaseKullanimi {

    public static void main(String[] args) {
        int ay = 4;
        String ayAdi = "";
        switch (ay) {
            case 0:
                ayAdi = "Ocak";
                break;
            case 1:
                ayAdi = "Şubat";
                break;
            default:
                ayAdi = "bilinmiyor";
        }

        System.out.println("Yılın " + (ay + 1) + ". ayı " + ayAdi);
    }
}
