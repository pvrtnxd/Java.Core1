public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Car granta = new Car();
        granta.setBrand("Lada");
        granta.setModel("Granta");
        granta.setYear(2015);
        granta.setCountry("Russia");
        granta.setColor("yellow");
        granta.setEngineVolume(1.7);

        System.out.println("Марка авто: " + granta.getBrand() +
                " Модель: " + granta.getModel() +
                " Год: " + granta.getYear() +
                " Цвет:  " + granta.getColor() +
                " Страна: " + granta.getCountry() +
                " Объем двигателя: " + granta.getEngineVolume());

        Car audi = new Car();
        audi.setBrand("Audi");
        audi.setModel("A8 50 L TDI quattro");
        audi.setYear(2020);
        audi.setCountry("Germany");
        audi.setColor("black");
        audi.setEngineVolume(3.0);

        System.out.println("Марка авто: " + audi.getBrand() +
                " Модель: " + audi.getModel() +
                " Год: " + audi.getYear() +
                " Цвет:  " + audi.getColor() +
                " Страна: " + audi.getCountry() +
                " Объем двигателя: " + audi.getEngineVolume());

        Car bmw = new Car();
        bmw.setBrand("BMW");
        bmw.setModel("Z8");
        bmw.setYear(2021);
        bmw.setCountry("Germany");
        bmw.setColor("black");
        bmw.setEngineVolume(3.0);

        System.out.println("Марка авто: " + bmw.getBrand() +
                " Модель: " + bmw.getModel() +
                " Год: " + bmw.getYear() +
                " Цвет:  " + bmw.getColor() +
                " Страна: " + bmw.getCountry() +
                " Объем двигателя: " + bmw.getEngineVolume());

        Car kia = new Car();
        kia.setBrand("Kia");
        kia.setModel("Sportage 4 поколение");
        kia.setYear(2018);
        kia.setCountry("South Korea");
        kia.setColor("red");
        kia.setEngineVolume(2.4);

        System.out.println("Марка авто: " + kia.getBrand() +
                " Модель: " + kia.getModel() +
                " Год: " + kia.getYear() +
                " Цвет:  " + kia.getColor() +
                " Страна: " + kia.getCountry() +
                " Объем двигателя: " + kia.getEngineVolume());

        Car hyundai = new Car();
        hyundai.setBrand("Hyandai");
        hyundai.setModel("Avante");
        hyundai.setYear(2015);
        hyundai.setCountry("South Korea");
        hyundai.setColor("orange");
        hyundai.setEngineVolume(1.6);

        System.out.println("Марка авто: " + hyundai.getBrand() +
                " Модель: " + hyundai.getModel() +
                " Год: " + hyundai.getYear() +
                " Цвет:  " + hyundai.getColor() +
                " Страна: " + hyundai.getCountry() +
                " Объем двигателя: " + hyundai.getEngineVolume());

        System.out.println("Задание 2");

        CarList.printCar();


    }
}