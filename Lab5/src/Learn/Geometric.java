package Learn;

import java.util.Date;

public class Geometric {
    private String color;
    private Date date;

    public Geometric() {
    }

    public Geometric(String color) {
        this.color = color;
    }

    public Geometric(String color, Date date) {
        this.color = color;
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getArea() {
        return 0.0;
    }
}
