package com.enigma.di;

public class app {

    public static void main(String[] args) {
        Car toyota = new Car(wheel:4, color:"yellow");
        toyota.setColor("Black");
        toyota.setWheel(6);
        System.out.println("Ban Mobil: " +  toyota.getWheel());
        System.out.println("Warna Mobil: " + toyota.getColor());

    }
public Integer sum(Integer angka1, Integer angka2) {
        Integer result = angka1 + angka2;
        return result;
}

public void printname(String name) {
    System.out.println(name);
}

}
