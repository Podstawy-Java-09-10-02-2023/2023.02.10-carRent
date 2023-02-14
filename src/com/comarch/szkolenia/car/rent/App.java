package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.database.CarDatabase;
import com.comarch.szkolenia.car.rent.gui.GUI;
import com.comarch.szkolenia.car.rent.model.Car;

public class App {
    public static void main(String[] args) {
        CarDatabase carDatabase = new CarDatabase();
        String choose = "";
        while (!choose.equals("3")) {
            choose = GUI.showMenu();
            switch (choose) {
                case "1":
                    GUI.printCars(carDatabase.getCars());
                    break;
                case "2":
                    GUI.showRentResult(carDatabase.rentCar(GUI.showRentCar()));
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Incorrect choose !!");
            }
        }
    }
}
