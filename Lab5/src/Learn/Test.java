package Learn;

public class Test {
    public static void main(String[] args) {

        Geometric shapes[] = {new Circle("red", 4),
                              new Rectangle("Blue", 5, 5)};

        for (Geometric shape: shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
        }
    }


}
