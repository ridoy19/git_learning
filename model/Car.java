import java.util.Date;
import java.util.String;

public class Car {
    private long id;
    private String model;
    private int year;
    private Brand brand;

    Car() {

    }

    Car(long id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = Date.getYear();
    }

    public long getId() {
        return id;
    };
    public void setId(long id);

    public String getModel() {
        return model;
    };
    public void setMdel(String model);

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

}