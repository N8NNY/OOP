package Learn;

public class Rectangle extends Geometric{
    private int height;
    private int width;


    public Rectangle(String color,int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "color = " + getColor() +
                " ,height = " + height +
                " ,width = " + width +
                '}';
    }
}
