import java.util.Date;
import java.util.String;

public class Car {
    private long id;
    private String model;
    private int year;

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
    public void setYear(int year) {
        this.year = year;   
    };
}
