package NsidedRegularPolygon;

public class Main {
    public static void main(String[] args) {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(4, 6);

        System.out.println(poly1.getPerimeter());
        System.out.println(poly1.getArea());
        System.out.println(poly2.getPerimeter());
        System.out.println(poly2.getArea());

    }
}
