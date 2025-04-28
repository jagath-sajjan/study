class Car {
    private String model;
    private String brand;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getDetails() {
        return "Brand: " + brand + ", Model: " + model;
    }
}

class CarPrinter {
    public void printDetails(Car car) {
        System.out.println(car.getDetails());
    }
}

public class mainn {
    public static void main(String[] args) {
        Car car = new Car("Mustang", "Ford");
        CarPrinter printer = new CarPrinter();
        printer.printDetails(car);
    }
}
