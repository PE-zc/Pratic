package com.pratic;

public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        int productionPerHour = 221;
        double cars;

        if (speed >= 1 && speed <= 4) {
            return cars = speed * productionPerHour;
        }  else if (speed >= 5 && speed <= 8) {
            return cars = (speed * productionPerHour) * 0.9;
        } else if (speed == 9) {
            return cars = (speed * productionPerHour) * 0.8;
        }  else {
            return cars = (speed * productionPerHour) * 0.77;
        }
    }
    public int workingItemsPerMinute(int speed) {
        int seg = 60;
        return (int) (productionRatePerHour(speed) / seg);
    }
}

