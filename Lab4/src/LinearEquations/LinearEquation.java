package LinearEquations;

public class LinearEquation {
    private double a, b, c, d, e, f;
    public LinearEquation() {

    }

    public LinearEquation(double a, double b, double c, double d, double e, double f)   {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean IsSolvable()  {
        if((a*d) - (b*d) == 0)
            return false;
        else return true;
    }

    public double getX()    {
        return (((e*d) - (b*f)) / ((a*d) - (b * c)));
    }

    public double getY()    {

        return (((a*f) - (e*c)) / ((a*d) - (b*c)));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
}
