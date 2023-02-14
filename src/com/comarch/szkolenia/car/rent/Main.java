package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.model.Car;

public class Main {
    public static void main(String[] args) {
        final int i = 5;

        final Car car = new Car("ABC", "DEF", 123.123, "KR100");
        System.out.println(car.getBrand());
        System.out.println(car.getModel());

        car.setBrand("XYZ");

        System.out.println(car.getBrand());
        System.out.println(car.getModel());

        //car = new Car("asdf", "Sadf", 234.234, "asdfg345");
        System.out.println("---------------------------------------");
        int[] ints = new int[10];
        System.out.println(ints[5]);

        Car[] cars = new Car[10];
        cars[5] = new Car("ABC", "DEF", 123.123, "KR100");
        System.out.println(cars[5]);

        Car car2 = cars[7];
        System.out.println(car2);
        //car2.isRent();

        Car car3 = new Car();
        System.out.println(car3.getBrand());
        System.out.println(car3.getModel());
        System.out.println(car3.getPrice());
        System.out.println(car3.isRent());
        System.out.println(car3.getPlate());

        /*Car c = metoda();
        if(c != null) {
            c.isRent();
        }*/
    }
}
