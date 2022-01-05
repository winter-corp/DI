package com.enigma.di;

public class app {

    static String address = "Jakarta";
    String alamat = "Jakarta";

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        String name = "Dimasraya";
        String fullname = "Dimasraya Siagian";
        Integer umur = 21;
        int umur2 = 25;

        //System.out.println(address);

        // memanggil variabel non static  di method static harus dibuat instance object baru  seperti class app
        App app = new App();
        System.out.println(app.alamat);
        Integer resultsum = app.sum(5, 5);
        System.out.println(resultsum);
        app.printName("Dimas");
    }

    public Integer sum(Integer angka1, Integer angka2) {
        Integer result = angka1 + angka2;
        return result;
    }

    public void printname(String name) {
        System.out.println(name);
    }

        // byte short int log float double boolean -- tipe data primitive
        // String Collection(List, Set, Map) -- Tipe data non primitive

        // Looping
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        if else
         if (umur == 25) {
              System.out.println("Benar");
        // eksekusi program disini

        } else {
                System.out.println("salah");
        // eksekusi program else
    }


    int [] numbers = new int[5];
    numbers[0] = 5;
    numbers[1] = 4;
    numbers[2] = 3;
    numbers[3] = 2;
    numbers[4] = 1;

        for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }

    String[] names = {"Dimasraya", "Siagian"};
}
