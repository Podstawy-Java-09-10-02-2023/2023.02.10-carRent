package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class GUI {
    static Scanner scanner = new Scanner(System.in);
    public static String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return scanner.nextLine();
    }

    public static void printCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(
                    car.getBrand() + " " +
                            car.getModel() + " Price: " +
                            car.getPrice() + " Plate: " +
                            car.getPlate() + " Available: " + (car.isRent() ? "No" : "Yes"));
        }
    }

    public static String showRentCar() {
        System.out.println("Plate:");
        return scanner.nextLine();
    }

    public static void showRentResult(boolean success) {
        System.out.println(success ? "Success !!" : "Fail !!");
    }
}
