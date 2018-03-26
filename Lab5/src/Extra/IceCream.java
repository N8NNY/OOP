package Extra;

public class IceCream extends DessertItem{
    private double price;

    public IceCream(String name, double price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getCost() {
        return (int)Math.round(price);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
