package NsidedRegularPolygon;

public class RegularPolygon {
    private double s;
    private double n;

    public RegularPolygon() {

    }

    public RegularPolygon(double s, double n) {
        this.s = s;
        this.n = n;
    }

    public double getPerimeter() {
        return s * n;
    }

    public double getArea() {
        return (n * (s * s)) / (4 * Math.tan(Math.PI / n));
    }

    public double getS() {
        return s;
    }

    public double getN() {
        return n;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void setN(double n) {
        this.n = n;
    }
}
