package Some;

public class Test {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setId(100L);
        newCar.setModel("Toyota Yaris");
        newCar.setYear(2020);
        newCar.setBrand(Brand.TOYOTA);
        System.out.println(newCar.toString());
    }
}

class Car {
    private long id;
    private String model;
    private int year;
    private Brand brand;

    Car() {

    }

    Car(long id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = 2019;
    }

    public long getId() {
        return id;
    };
    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    };
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    };
    public void setYear(int year) {
        this.year = year;
    }

    public Brand getbrand() {
        return brand;
    };
    public void setBrand(Brand brand) {
        this.brand = brand;
    };

    public String toString() {
        return "{\nid: "+ id + "\nmodel: " + model + "\n}";
    }
}

enum Brand {
    TOYOTA,
    BMW;
}