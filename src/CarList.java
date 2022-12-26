public class CarList {



    public static final Car[] cars = {
            new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия"),
            new Car("Audi", "A8 50 L TDI quattro", 3.0,"черный", 2020, "Германия"),
            new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия" ),
            new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",2018, "Южная Корея"),
            new Car("Hyundai", "Avante", 1.6, "оранжевый",2016,"Южная Корея")
    };

    public static  void printCar() {
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}
