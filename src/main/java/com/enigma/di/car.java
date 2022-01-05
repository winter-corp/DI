package com.enigma.di;

public class car {

    // access modifier di java (PRivate, protected, public)
    // public properti atau method bisa dipanggil di file atau class manapun
    // protected bisa diakses di class turunan (inharitance)

    private Integer wheel;

    private String color;

    public Car(Integer wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    public Integer getWheel() {
        return this.wheel;
    }

    public String getColor() {
        return this.color;
    }

    public void setwheel(Integer wheel) {
        this.wheel = wheel;
    }

    public void setcolor(String color) {
        this.color = color;
    }
}
