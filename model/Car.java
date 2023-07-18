import java.util.Date;
import java.util.String;

public class Car {
    private long id;
    private String model;
    private int year;
    private Brand brand;
    private double price;

    Car() {

    }

    Car(long id, String model, int year, double price) {
        this.id = id;
        this.model = model;
        this.year = Date.getYear();
        this.price = price;
    }

    public long getId() {
        return id;
    };
    public void setId(long id) {
        this.id = id;   
    };

    public String getModel() {
        return model;
    };
    public void setMdel(String model) {
        this.model = model;
    };

    public int getYear() {
        return year;
    };
    public void setYear(int year);

    public Brand getbrand() {
            return brand;
        };
    public void setBrand(Brand brand) {
        this.brand = brand;
    };

    public void setYear(int year) {
        this.year = year;   
    };

    public double getPrice() {
        return price;
    };
    public void setPrice(double price) {
        this.price = price;   
    };
}
