package Extra;

public class Sundae extends IceCream {
    private String topping;
    private double price1;
    private double cost;

    public Sundae(String name, double price, String topping, double price1) {
        super(name, price);
        this.topping = topping;
        this.price1 = price1;
        cost = price + price1;
    }

    @Override
    public int getCost() {
        return (int)Math.round(cost);
    }
}
