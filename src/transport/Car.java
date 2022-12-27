package transport;

import java.util.SplittableRandom;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int  year;
    private final String country;
    private   String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTyres;
    private Key key;

    public Car (String brand, String model,
                double engineVolume, String color,
                int year, String country, String typeOfBody,
                int seatsCount, Key key) {


        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key
        }


        this.gears = "МКПП";
        this.regNumber = "x000xx000";
        this.typeOfBody = "седан";
        this.seatsCount = 5;
        this.summerTyres = true;

        
    }

    Car() {

    }


    @Override
    public String toString() {
        return "Машина: " + brand + " " + model + "; Объем двигателя: " + engineVolume + "; Цвет кузова: " + color + "; Год выпуска: " + year + "; Сборка в  " + country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null){
            this.gears = "МКПП";
        } else {
            this.gears = gears;
        }
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null){
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void  changeTyres () {
        summerTyres =! summerTyres;
    }

    public boolean isCorrectRegNumber ()  {
        if (regNumber.length() != 9) {
            return  false;
        }
        char [] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                 !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
    }
    public  static class  Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKeyAccess;

        public Key (boolean remoteRunEngine, boolean withoutKeyAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public Key () {
         this(false, false);

        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;

        }


    }
}
