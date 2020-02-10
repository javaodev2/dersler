package com.example.ders4;

public class ForDonguleri {

    public static void main(String[] args) {

        // Birer birer 15'e kadar
        for (int i = 0; i < 15; i++) {
            System.out.println("Birer " + i);
            if (i == 5){
                break; // break for döngüsünü keser
            }
        }

        for (int i = 0; i < 15; i++) {
            if (i > 5){
                continue; // döngüyü atlatmak için başa döner
            }
            System.out.println("Birer " + i);
        }

        for (int i = 0; i < 20; i++) {
            if (i < 10 || i > 15){
                continue;
            }
            System.out.println("Birer " + i);
        }



    }
}
